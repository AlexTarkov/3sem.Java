/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberthree;

import java.util.Arrays;

/**
 *
 * @author m10baa3
 */
public class NumberThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {10, 10, 30, -21, -10, 0};
        Comb c = new Comb(arr);
        
        if (arr.length < 3) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            if (sum > 0) {
                c.printComb();
                System.exit(0);
            } else {
                System.out.println("No"); 
                System.exit(0);
            }
        }
        
        if (c.isValid()) {
            c.printComb(); 
            System.exit(0);
        }
        
        while (c.isHave) {
            c.getNext(); 
            if (c.isValid()) {
                c.printComb(); 
                System.exit(0);
            } 
        }
        
        System.out.println("No"); System.exit(0);
    }
}


class Comb {
    int[] arr = null;
    boolean isHave = true;
    
    public boolean isValid() {
        for (int i=0; i < (arr.length - 2); i++) {
            if ((arr[i] + arr[i + 1] + arr[i + 2]) <= 0) {
                return false;
            }
        }
        return true;
    }
    
    public Comb(int[] a) {
        this.arr = a;
        Arrays.sort(this.arr);
        //for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
    }
    
    public void printComb() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void getNext() {
        int k = arr.length - 1;
        //System.out.println("getNext");
        
        while ((k > 0) && (arr[k] <= arr[k - 1])) {
            k--;
        } 
        
        if (k == 0) {
            isHave = false; return;
        }
        k--;
        
        int m = k + 1;
        
        for (int j = k+1; j < arr.length; j++) {
            if( (arr[j] > arr[k]) && (arr[j] < arr[m]) ) {
                m = j; 
            } 
        }
        
        int buf = arr[k];
        arr[k] = arr[m];
        arr[m] = buf;
    
        for (int j = 1; j < (arr.length - (k + 1)) / 2; j++) {
            buf = arr[k + j]; 
            arr[k + j] = arr[arr.length - (1 + j)]; 
            arr[arr.length - (1 + j)] = buf; 
        }
        //printComb();
        //int buf = arr[k];
    }
}
