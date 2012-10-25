/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Введите выражение");
        String[] lexems = input.split("[ ]");
        int mult = 1;
        String toException = "";
        int result = 0;
        
        try {
            for (String str : lexems) {
                toException = str;
                if ((str.equals("+") || (str.equals("-"))) && (mult == 0)) {
                    if (str.equals("+")) {
                        mult = 1;
                    } else {
                        mult = -1;
                    }
                } else {
                    int k = Integer.parseInt(str);
                    if ((mult != 0) && (k >= 0) && (str.charAt(0) != '+')) {
                        result += mult * Integer.parseInt(str);
                        mult = 0;
                    } else {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, input + "= '" + toException + "' " 
                    + ((mult == 0) ? "- Ожидался оператор +/-" : "- Ожидалось число"));
            return;
        }

        JOptionPane.showMessageDialog(null, input + " = " + result); 
    }
}
