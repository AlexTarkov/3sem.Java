/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class Shapes {
    public static float getArea(ArrayList<Shape> list) {
        float area = 0;
        Shape temp;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = (Shape)iterator.next();
            area += temp.getArea();
        }
        //for (int i = 0; i < list.size(); i++) {}
        return area;
    }
    
    public static ArrayList<Shape> getEquals(ArrayList<Shape> list) {
        ArrayList<Shape> result = new ArrayList();
        ArrayList<Shape> temp = (ArrayList<Shape>)list.clone(); //?!
        boolean bool = false;
        for (int i = 0; i < temp.size(); i++) {
            bool = false;
            Shape tmp = temp.get(i);
            for (int l = i+1; l < temp.size(); l++) {
                Shape tmp2 = (Shape)temp.get(l);
                if (tmp.equals(tmp2)) {
                    result.add(tmp2);
                    bool = true;
                    temp.remove(l);
                }
                    
            }
            if (bool) result.add(tmp);
        }
        
        return result;
    }
}
