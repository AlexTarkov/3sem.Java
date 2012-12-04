/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author alex
 */
public class Rectangle extends Shape {
    
    protected float a, b;
    
    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public float getArea() {
        return this.a * this.b;
    }
    
    public String toString() {
        return "S: " + getArea() + ". Rectangle. Weight = " + a + ". Height = " + b + ".";
    }
    
}
