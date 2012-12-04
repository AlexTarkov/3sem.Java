/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

/**
 *
 * @author alex
 */
public class Figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList();
        for (int i = 1; i < 11; i++) {
            list.add(new Circle(i));
            list.add(new Rectangle(i,11-i));
            list.add(new Square(i));
        }
        
        //shapeTest();
        homeWork(list);
        printList(list);
    }
    
    public static void shapeTest() {
        ArrayList<Shape> list = new ArrayList();
        for (int i = 1; i < 11; i++) {
            list.add(new Circle(i));
            list.add(new Rectangle(i,11-i));
            list.add(new Square(i));
        }
        System.out.println("Общая площадь: " + Shapes.getArea(list));
        list = Shapes.getEquals(list);
        printList(list);
    }
    
    public static void homeWork(ArrayList<Shape> list) {
        Collections.sort(list);
    }
    
    public static void printList(ArrayList<Shape> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
