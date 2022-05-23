/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresfinal;

/**
 *
 * @author Adeat
 */
public class DatastructuresFinal {

    /**
     * @param args the command line arguments
     */
    int[] a = {2,3,4,5,6};
    private int n = 0;
    private int result;
    
    
    public static void main(String[] args) {
        genericPair test = new genericPair(2.8454 , 'c');
        System.out.println(test.first());
        System.out.println(test.second());
        int[] b = new int[10];
        System.out.println(b.length);
        System.out.println(sumEvens(a));
        
        
    }
        public int sumEvens(int[] a){
        if(n > a.length){
            return 0;
        }
        
        if(a[n] % 2 == 0){
            n++;
            result = a[n-1] + sumEvens(a);
        }
        else{
            n--;
            result =sumEvens(a);
        }
        return result;
    }
    
}
