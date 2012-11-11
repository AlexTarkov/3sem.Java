/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Calculator {
    public static String CalcDividers(int a) {
        String q2 = a + ", ", q1 = "" + 1;
        
        if (a == 1) return "1";
        if (a == 0) return "Все числа";
        
        for (int i = 2; i < (int)Math.sqrt(a)+((int)Math.sqrt(a) * (int)Math.sqrt(a) == a ? 0 : 1); i++) {
            if (a % i == 0) {
                q2 = q2 + a / i + ", ";
                q1 = i + ", " + q1;
            }
        }
        
        //System.out.print((int)Math.sqrt(a) * (int)Math.sqrt(a));
        
        q2 = q2 + ((int)Math.sqrt(a) * (int)Math.sqrt(a) == a ? ((int)Math.sqrt(a) + ", ") : "");
        
        //if ((a % (int)Math.sqrt(a) == 0) && ((int)Math.sqrt(a) > 1)) q2 = q2 + (int)Math.sqrt(a) + ", ";
        
        return q2 + q1;
    }
}
