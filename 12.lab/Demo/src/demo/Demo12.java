/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author alex
 */
public class Demo12 {
    public static void main(String[] args) {
        Demo1 p = new Demo1();
    }
}

class Demo1 {
    Demo1() { System.out.println("Demo 1 init."); }
    public static Demo2 demo_2_st = new Demo2();
    //public Demo2 demo_2_dyn = new Demo2(); // ЗАЦИКЛИВАНИЕ И БЕСКОНЕЧНОЕ ПОРОЖДЕНИЕ...
}

class Demo2 {
    Demo2() { System.out.println("Demo 2 init."); }
    public static Demo1 demo_1 = new Demo1();
    //public Demo1 demo_1_dyn = new Demo1();
}