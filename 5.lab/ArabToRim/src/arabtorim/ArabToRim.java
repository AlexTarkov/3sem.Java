/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arabtorim;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ArabToRim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "";
        int input = 0;
        
        // Get the input string
        input = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter number between 1 to 12"));
        
        switch (input)
        {
            case 1: msg = "I"; break;
            case 2: msg = "II"; break;
            case 3: msg = "III"; break;
            case 4: msg = "IV"; break;
            case 5: msg = "V"; break;
            case 6: msg = "VI"; break;
            case 7: msg = "VII"; break;
            case 8: msg = "VIII"; break;
            case 9: msg = "IX"; break;
            case 10: msg = "X"; break;
            case 11: msg = "XI"; break;
            case 12: msg = "XII"; break;
            default:msg = "Invalid number";
        }
        
        // Display the number in words if with in range
        JOptionPane.showMessageDialog(null,msg);
    }
}
