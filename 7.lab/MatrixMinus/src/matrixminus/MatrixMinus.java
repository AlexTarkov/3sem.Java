/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixminus;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class MatrixMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matr = { 
                {1,1,0,5,1}, 
                {1,1,0,5,1}, 
                {1,1,0,5,1}, 
                {1,1,0,5,1},
                {1,1,0,5,1}
        };
        begin:{
            for(int k[]:matr){
                for(int m:k){
                    if(m<0) break begin;
                }
            }
        JOptionPane.showMessageDialog(null,"Отрицательных чисел не найдено.");
        System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"Отрицательные числа найдены.");
    }
}
