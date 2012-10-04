/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloageproject;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class HelloAgeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = (JOptionPane.showInputDialog("What is you name?"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        
        int i = 0;
        while(i<age){
            JOptionPane.showMessageDialog(null,"Hello,"+name);
            i++;
        }
        
        
    }
}
