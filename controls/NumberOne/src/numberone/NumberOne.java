/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberone;

/**
 *
 * @author alex
 */
public class NumberOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] t = { "City_1", "2City", "CI_3_TY", "5City", "City_3", "CI_1_TY" }; // NOT SPECIFICATION
        String[][] w = { 
            { "City_1", "1City", "CI_1_TY" },
            { "City_2", "2City", "CI_2_TY" },
            { "City_3", "3City", "CI_3_TY" },
            { "City_4", "4City", "CI_4_TY" },
            { "City_5", "5City", "CI_5_TY" }
        };
        
        String[] result = new String[t.length];
        int resultCount = 0;
        
        toLow(t);
        for (int i = 0; i < w.length; i++) {
            toLow(w[i]);
        }
        
        for (String i : t) { //?? NOT SPECIFICATION !!
            for (int j = 0; j < w.length; j++) {
                if (w[j] != null) {
                    for (String k : w[j]) {
                        if (i.equals(k)) {
                            w[j] = null;
                            result[resultCount] = i;
                            resultCount++;
                            break;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < resultCount; i++) {
            System.out.println(result[i]);
        }
        
    }
    
    public static boolean getTruth(String[] a, String[] b){
        
        return false;
    }
    
    public static void toLow(String a[]){
        //for(String i:a){ //копирование объекта?? (не ссылки?)
        for(int i=0; i<a.length; i++){
            a[i] = a[i].toLowerCase();
            //i = i.toLowerCase();
            //System.out.println(i);
        }
    }
}
