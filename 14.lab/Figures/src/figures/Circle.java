/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author alex
 */
public class Circle extends Shape {
    
    private float r;
    
    public Circle(float r) {
        this.r = r;
    }
    
    public float getArea() {
        return (float)Math.PI * r * r;
    }
    
    public String toString() {
        return "S: " + getArea() + ". Circle. Radius = " + r + ".";
    }
}
