/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tl2;

/**
 *
 * @author admin
 */
public class TrafficLight {
    public static void main(String[] args){
        
        Lights light = new Lights();
        LButtons lbutton = new LButtons(light);
        
        light.setVisible(true);
        lbutton.setVisible(true);
        
        //System.out.println("aaa");
    }
    
}
