/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Angles {
    
    public static void main(String[] args) {
        System.out.println("Введите 3 стороны треугольника");
        Scanner input= new Scanner(System.in);
        String str=input.next();
        double d = Double.parseDouble(str);
        System.out.println("Sin: " + Math.sin(d) 
                + " / " + Math.sin(Math.toDegrees(d)) 
                + " / " + Math.sin(Math.toRadians(d)));
        
        System.out.println("Cos: " + Math.cos(d) 
                + " / " + Math.cos(Math.toDegrees(d)) 
                + " / " + Math.cos(Math.toRadians(d)));
        
        System.out.println("Tan: " + Math.tan(d) 
                + " / " + Math.tan(Math.toDegrees(d)) 
                + " / " + Math.tan(Math.toRadians(d)));
    }
    
}
