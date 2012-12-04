/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author alex
 */
public class Square extends Rectangle {
    public Square(float a) {
        super(a,a);
    }

public String toString() {
        return "S: " + getArea() + ". Square. Side = " + a + "."; //PROTECTED. MAY BE NEED getWeight...
    }
}
