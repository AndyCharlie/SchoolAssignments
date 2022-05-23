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
public class SumOfArray {
    private int n = 0;
    private int result;
    
    public int sumEvens(int[] a){
        if(n > a.length){
            return 0;
        }
        
        if(a[n] % 2 == 0){
            n++;
            result = a[n-1] + sumEvens(a);
        }
        else{
            n++;
            result = sumEvens(a);
        }
        return result;
    }
        
}
    
    
}
