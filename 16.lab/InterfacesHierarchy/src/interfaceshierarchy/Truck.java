/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceshierarchy;

/**
 *
 * @author alex
 */
public class Truck implements Automobile {
    
    private int width;
    private int height;
    
    private int capacity;
    
    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getPower() {
        return this.capacity * (this.height * this.width);
    }
    
    
    
}
