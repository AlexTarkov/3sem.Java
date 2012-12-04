/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.lang.reflect.Constructor;

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
    public static void main(String[] args) throws Exception {
        //Demo dem = new Demo(5);               // 1 WAY
        //Class demo = dem.getClass();          // 1 WAY
        //Class demo = Demo.class;              // 2 WAY
        Class demo = Class.forName("demo.Demo");// 3 WAY
        Object dem2 = demo.getDeclaredConstructors()[0].newInstance(5); //IT WORK
        //Class[] m = {int.class};
        //Object dem2 = demo.getConstructor(m).newInstance(5);
        // МОЖНО ЛИ INT КАК ЛИБО ВЫЗВАТЬ С ПОМОЩЬЮ getConstructor(ParamsTypes)
        
        Matrix.createMatrix(3, 3, -145);
        
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

class Matrix {
    static void createMatrix(int n, int m, int k) { //МЕРТВЫЙ КОД??
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int l = 0; l < m; l++) {
                mas[i][l] = k;
            }
    System.out.println(mas[2][2]);
    }
}


