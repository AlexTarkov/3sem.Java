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
        
        //МОЖНО МЕТОДАМИ ОТРАЖЕНИЯ
        
        FatFly fatfly = new FatFly();
        TinyFly tinyfly = new TinyFly();
        FatFrog fatfrog = new FatFrog();
        TinyFrog tinyfrog = new TinyFrog();
        
        fatfly.bzzz();
        fatfly.fly();
        tinyfly.fly();
        tinyfly.bzzz();
        
        fatfrog.croak();
        tinyfrog.croak();
        
        fatfrog.catchFly(fatfly);
        fatfrog.catchFly(tinyfly);
        fatfrog.catchFly(null);
        
        tinyfrog.catchFly(fatfly);
        tinyfrog.catchFly(tinyfly);
        tinyfrog.catchFly(null);
        
//        tinyfrog.catchFly(new FatFly() { // UNCOMMENT TO 3 EX IN DOP. COURSE
//            { System.out.println("I AM WORK! AND MY BZZZ IS WORK TO: " ); this.bzzz(); }
//        } 
//                );
        
    }
}
