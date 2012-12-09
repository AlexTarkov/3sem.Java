/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public abstract class AbstractFrog implements Comparable<AbstractFrog> {
    
    public int Weight;
    
    public void jump(){ 
        System.out.println(this.getClass().getName() + ".jump() is work"); 
    }
    
    public void catchFly(Fly a){
        System.out.println(this.getClass().getName() + ".catchFly() is work"); 
    }
    
    public abstract void croak();
    
    
    @Override
    public int compareTo(AbstractFrog a) {
        if (this.Weight > a.Weight) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
