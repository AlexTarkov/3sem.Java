/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author alex
 */
public abstract class Shape implements Comparable<Shape> {
    
    abstract float getArea();
    
    public boolean equals(Shape a) {
        return (this.getArea() == a.getArea()) ? true : false ;
    }
    
    @Override
    public abstract String toString();
    
    public int compareTo(Shape o) {
//        if (o.getArea() >= this.getArea()) {
//            return -1
//        else
        return (this.getArea() >= o.getArea()) ? 1 : -1;
    }
}
