/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab12_datastructures;
import java.math.BigInteger;
import java.io.*;
import java.util.*;
/**
 *
 * @author Adeat
 */
public class lab12 {
    private static BigInteger TWO = BigInteger.valueOf(2);
    static int arr[]= {1,1};
    
    public static int sum(int a[],int n) {
	if (n<=0) return 0;
	return sum(a,n-1) + a[n-1];
    } 
	
	
    public static BigInteger fibonacci(BigInteger n) {
	if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) 
            return n;
	else {
	    return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(TWO)));
	}
    } 

}

