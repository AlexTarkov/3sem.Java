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
public class Heron {
    
    public static void main(String[] args) {
        
        System.out.println("Введите 3 стороны треугольника");
        Scanner input= new Scanner(System.in);
        double p = 0;
        double[] mas = new double[3];
        for (int i=0; i < 3; i++) {
            String str=input.next();
            mas[i] = Double.parseDouble(str);
            p += mas[i];
        }
        p = p / 2;
        System.out.println(Math.sqrt(p * (p - mas[0]) * (p - mas[1]) * (p - mas[2])));
    }
    
}
