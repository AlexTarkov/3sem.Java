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
        String input = JOptionPane.showInputDialog("Введите выражение");
        String[] lexems = input.split("[ ]");
        Queue q = new Queue();
        int mult = 1;
        String toException = "";
        try {
            for (String str : lexems) {
                toException = str;
                if ((str.equals("+") || (str.equals("-"))) && (mult == 0)) {
                    if (str.equals("+")) {
                        mult = 1;
                    } else {
                        mult = -1;
                    }
                } else {
                    int k = Integer.parseInt(str);
                    if ((mult != 0) && (k >= 0) && (str.charAt(0) != '+')) {
                        q.add(mult * Integer.parseInt(str));
                        mult = 0;
                    } else {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, input + "= '" + toException + "' " 
                    + ((mult == 0) ? "- Ожидался оператор +/-" : "- Ожидалось число"));
            return;
            //System.out.println(toException);
        }
        
        int result = 0;
        while (q.hasNext()) {
            result += q.getNext();
        }
        JOptionPane.showMessageDialog(null, input + " = " + result); 
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
