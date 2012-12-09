/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyproject;

/**
 *
 * @author alex
 */
public class FlyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FatFrog a = new FatFrog();
        
        FlyAndMosquito fm = new FlyAndMosquito();
        Fly f = (Fly)fm;
        Mosquito m = (Mosquito)fm;
        f.fly();
        m.fly();
        
    }
}
