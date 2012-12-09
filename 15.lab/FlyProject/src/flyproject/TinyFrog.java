/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public class TinyFrog extends AbstractFrog {
    
    @Override
    public void catchFly(Fly a){
//        if (!(a instanceof FatFly)) {
//            throw new RuntimeException("Argument is not valid!!");
//        }
        
//        if (!a.getClass().equals(FatFly.class)) {
//            throw new RuntimeException("Argument is not valid!!");
//        }
        
        if (!FatFly.class.isAssignableFrom(a.getClass())) {
            throw new RuntimeException("Argument is not valid!!");
        }
        
        System.out.println(this.getClass().getName() + 
                ".catchFly() is work (TINYFROG)");
        
    }
    
    @Override
    public void croak() {
        System.out.println(this.getClass().getName() + ".croak() is work"); 
    }
    
}
