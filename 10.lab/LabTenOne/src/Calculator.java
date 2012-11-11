/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Calculator {
    public static long Calculate(int a, int n, int func) {
        if (func == 0) 
            return CalcWhile(a, n);
        else if (func == 1) 
            return CalcRepeat(a, n);
        else 
            return CalcFor(a, n);
    }
    
    private static long CalcWhile(int a, int n) {
                long result = a;
        int m = 1;
        int nr = n;
        while (n / 2 > 0) {
            result *= result;
            n = n>>1;
            m = m<<1;
            System.out.println("n = " + m);
        }
        while (nr-m > 0) {
            result *= a;
            m++;
        }
        return result;
    }
    
    private static long CalcRepeat(int a, int n) {
        long result = 1;
        do {
            result *= a;
            n--;
        } while (n > 0);
        return result;
    }
    
    private static long CalcFor(int a, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
    
}
