/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public abstract class AbstractFrog {
    public void jump(){ 
        System.out.println(this.getClass().getName() + ".jump() is work"); 
    }
    public void catchFly(Fly a){
        System.out.println(this.getClass().getName() + ".catchFly() is work"); 
    }
    public abstract void croak();
}
