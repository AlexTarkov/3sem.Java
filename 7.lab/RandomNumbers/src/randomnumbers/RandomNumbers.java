/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Введите число N:"));
        double s = Double.parseDouble(JOptionPane.showInputDialog("Введите предельную сумму:"));
        int sumlen = 0;
        
        Queue[] qs = new Queue[n];
        int[] len = new int[n];
        
        for (int i = 0; i < n; i++) {
            double sum = 0;
            int l = 0;
            do {
                double rnd = Math.random();
                sum += rnd;
                qs[i].add(rnd);
                l++;
            } while (sum < s);
            len[i] = l;
            sumlen += l;
        }
        
        double average = (1.0) * sumlen / n;
        double rms = 0;
        
        for (int i = 0; i < n; i++) {
            rms += (len[i] - average) * (len[i] - average);
        }
        
        rms *= 1.0 / n;
        rms = Math.sqrt(rms);
        
        String buf = "";
        for (Queue q : qs) {    
            while (q.hasNext()) {
                buf += q.getNext() + " ";
            }
        }
        
    }
}


class Queue {
    
    private Queue   head;
    private Queue   tail;
    private Queue   next;
    private double  element;
    
    public Queue() {
        this.next = null;
        this.head = this;
        this.tail = this;
    }
    
    public void add(double a) {
        Queue buf = new Queue();
        buf.element = a;
        this.tail.next = buf;
        this.tail = buf;   
    }
    
    public double getNext() {
        this.head = this.head.next;
        return this.head.element;
    }
    
    public boolean hasNext() {
        return (this.head.next != null);
    }
    
}