/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Введите число N");
        String[] lexems = input.split("[ ]");
        Queue q = new Queue();
        int mult = 1;
        for (String str : lexems) {
            if ((str.equals("+") || (str.equals("-"))) && (mult == 0)) {
                if (str.equals("+")) {
                    mult = 1;
                } else {
                    mult = -1;
                }
            } else {
                int k = Integer.parseInt(str);
                if ((mult != 0) && (k >= 0)) {
                    q.add(mult * Integer.parseInt(str));
                }
            }
        }
    }
}


class Queue{
    
    private Queue head;
    private Queue tail;
    private Queue next;
    private int element;
    
    public Queue() {
        this.next = null;
        this.head = this;
        this.tail = this;
    }
    
    public void add(int a) {
        Queue buf = new Queue();
        buf.element = a;
        this.tail.next = buf;
        this.tail = buf;
        
    }
    
    public int getNext(){
        this.head = this.head.next;
        return this.head.element;
    }
    
    public boolean hasNext(){
        return (this.head.next != null);
    }
    
}
