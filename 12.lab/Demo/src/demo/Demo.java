/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author alex
 */
public class Demo {
    
    public static String StaticVariable = "Static Variable";
    public String DynamicVariable = "Dynamic Variable";
    
    static { // Anonumous Static Constructor
        System.out.println("Demo Anonumous Static Constructor");
    }
    
    { // Anonumous Dynamic Constructor
        System.out.println("Demo Anonumous Dynamic Constructor");
    }
    
    Demo(int a){ // Dynamic Constructor
        System.out.println("Demo Dynamic Constructor With Parameters");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demo d = new Demo(5);
        //ConstructorDemo cd = new ConstructorDemo();// COMMENT FOR HOME WORK
        //System.out.println("Test work program without call Class");
        
    }
}

class ConstructorDemo extends Demo{
    static HWTest HOME_WORK_VARIABLE = new HWTest();
    
    static {
        System.out.println("ConstructorDemo Static Anonumous Constructor (Write for HOME WORK)");
    }
    
    public ConstructorDemo(){
        super(5);
        System.out.println("ConstructorDemo Dynamic Constructor");
    }
}

class HWTest {

    public HWTest() {
        System.out.println("HOME WORK VARIABLE ACTIVATE");
    }
    
}


