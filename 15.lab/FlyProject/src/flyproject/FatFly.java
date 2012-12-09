/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public class FatFly extends AbstractFly implements Fly{
        
    @Override
    public void bzzz() {        
        System.out.println(this.getClass().getName() + ".bzzz() is work");
    }

//    @Override
//    public void fly() {
//        System.out.println(this.getClass().getName() + ".fly() is work");
//    }
 
}
