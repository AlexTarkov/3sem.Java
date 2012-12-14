/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceshierarchy;

/**
 *
 * @author alex
 */
public class Pickup extends Truck implements Car {
    
    private int safety;
    private int passengers;
    
    private int changeCapacity;
    
    

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getCapacity() {
        return super.getCapacity() * this.changeCapacity; //пример использования прошлых методов
    }

    @Override
    public int getSafety() {
        return this.safety;
    }

    @Override
    public int getCountPassengers() {
        return this.passengers;
    }

    @Override
    public int getPower() {
        return (this.getCapacity() + this.safety) * (this.getHeight() + this.getWidth()); //пример изменения
    }
    
}
    