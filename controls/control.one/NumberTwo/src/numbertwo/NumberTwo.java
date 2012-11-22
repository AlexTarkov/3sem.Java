/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertwo;

//import java.security.Principal;

/**
 *
 * @author m10baa3
 */
public class NumberTwo {

    /**
     * @param args the command line arguments
     */
    
    private static final int N = 10;
    
    public static void main(String[] args) {
        Line[] lines = new Line[N]; 
        lines[0] = new Line(0, 0, 1, 1);
        lines[1] = new Line(0, 0, -1, 1);
        lines[2] = new Line(0, 0, 14, 3);
        lines[3] = new Line(0, 0, 14, 3);
        lines[4] = new Line(0, 0, 14, 3);
        lines[5] = new Line(0, 0, 14, 3);
        lines[6] = new Line(0, 0, 14, 3);
        lines[7] = new Line(0, 0, 14, 3);
        lines[8] = new Line(0, 0, 14, 3);
        lines[9] = new Line(0, 0, 14, 3);
        
        for (int i = 0; i < (N-1); i++) {
            for (int j = i + 1; j < N; j++) {
                Line a = lines[i];
                Line b = lines[j];
                a.toZero(); 
                b.toZero();
                if (Line.isPerp(a, b)) {
                    a.printLine(); 
                    b.printLine();
                    System.out.println(); 
                }
            }
        } 
    }
}


class Line{
    int x1, x2, y1, y2;
    
    public void printLine() {
        System.out.print("(" + x2 + "; " + y2 + ") ");
    }
    
    public Line(int a,int b,int c,int d) {
        x1 = a; 
        y1 = b; 
        x2 = c; 
        y2 = d;
    }
    
    public static boolean isPerp(Line a, Line b) {
        return ((a.x2 * b.x2 + a.y2 * b.y2) == 0);
    }
    
    public void toZero() {
        x2 = x2 - x1;
        y2 = y2 - y1;
        y1 = x1 = 0;
    }
    
}