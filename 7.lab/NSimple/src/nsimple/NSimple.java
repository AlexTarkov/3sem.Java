/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nsimple;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class NSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog("Введите число N"));
        Queue q = new Queue();
        q.add(2);
        if (n >= 2) {
            for (int i = 3; i <= n; i = i + 2) {
                if (isSimple(i)) {
                    q.add(i); 
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Нет простых чисел.");
            System.exit(0);
        }
        
        while (q.hasNext()) {
            result += q.getNext() + " ";
        }
        
        JOptionPane.showMessageDialog(null, "Простые числа: " + result);
    }
    private static boolean isSimple(int a) {
        for (int i = 3; i <= (int)Math.sqrt(a); i += 2) {
            if ((a % i) == 0) return false;
        }
        return true;
    }
}


class Queue{
    
    private Queue   head;
    private Queue   tail;
    private Queue   next;
    private int     element;
    
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
    
    public int getNext() {
        this.head = this.head.next;
        return this.head.element;
    }
    
    public boolean hasNext() {
        return (this.head.next != null);
    }
    
}

//class Queue{
//    public static Queue head; //WHY NOT WORK??
//    private static Queue tail;
//    
//    public int k;
//    public Queue next = null;
//    //public Queue tail = null;
//    
//    Queue(int p){ this.k = p; }
//    Queue(){ Queue.tail = this; }
//    static{
//        Queue.head = null;
//         Queue.tail = null;
//    }
//    
//    public static void add(int a){ // только для одной очереди
//        Queue m = new Queue(a);
//        
//        Queue.tail.next = m;
//        Queue.tail = m;
//    }
//    
//}
