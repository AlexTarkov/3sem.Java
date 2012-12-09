/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public class FatFrog extends AbstractFrog{
    
    @Override
    public void croak() {
        System.out.println(this.getClass().getName() + ".croak() is work"); 
    }
    
}
