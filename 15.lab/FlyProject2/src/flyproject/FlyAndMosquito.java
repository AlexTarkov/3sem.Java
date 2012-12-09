/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public class FlyAndMosquito implements Fly, Mosquito{
    
    @Override
    public void bzzz() {
        System.out.println(this.getClass().getName() + ".bzzz() is work");
    }
    
    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + ".fly() is work");
    }
    
    @Override
    public void drink() {
        System.out.println(this.getClass().getName() + ".drink() is work");
    }
    
}
