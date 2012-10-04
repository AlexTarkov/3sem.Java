/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double high = 0;
        double fit = 0;
        double coef = 0;
        
        high = Double.parseDouble(JOptionPane.showInputDialog("Your High"));
        fit = Double.parseDouble(JOptionPane.showInputDialog("Your Fit"));
        
        if (high == 0) {
            JOptionPane.showMessageDialog(null, "High = 0"); System.exit(0);
        }
        
        // Compute average
        coef = Math.abs(fit/(high*high));
        
        // Perform if & else control
        if (coef < 19){
            JOptionPane.showMessageDialog(null, "Min. You result is " + coef);
        } else if (coef <= 25){
            JOptionPane.showMessageDialog(null, "Normal. You result is " + coef);
        } else if (coef <= 30) {
            JOptionPane.showMessageDialog(null, "Big*1. You result is " + coef);
        } else if (coef <= 35) {
            JOptionPane.showMessageDialog(null, "Big*2. You result is " + coef);
        } else {
            JOptionPane.showMessageDialog(null, "Big*1. You result is " + coef);
        }
    }
}
