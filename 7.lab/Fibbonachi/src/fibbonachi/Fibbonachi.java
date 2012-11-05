/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonachi;

/**
 *
 * @author m10baa3
 */
public class Fibbonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        a = 0; 
        b = 1;
        for(int i=0; i<20; i++){
            System.out.print( b + " ");
            b = a+b;
            a = b-a;
            //a = b;
        }
    }
}
