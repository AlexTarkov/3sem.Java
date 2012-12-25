/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import draw.GraphicComponent;
import java.awt.Graphics;
import static java.lang.Math.*;
import java.util.Arrays;

/**
 *
 * @author alex
 */
public class Test2 {
    public static void main(String[] args) {
        double a = sin(10);
        int m[] = new int[10];
        for (int i = 0; i < 10; i++) {
            m[i] = i;
        }
        m = Arrays.copyOfRange(m, 3, m.length);
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}

//paintPanel = new javax.swing.JPanel() {
//            public void paint(Graphics g) {
//                super.paint(g);
//                picture.draw(new GraphicComponent(g));
//            }
//        };
