/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public abstract class AbstractFly implements Fly  {
    
    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + ".fly() is work (from AbstractFly)");
    }

}
