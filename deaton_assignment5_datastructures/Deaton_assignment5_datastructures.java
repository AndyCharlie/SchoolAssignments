/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment5_datastructures;
import java.lang.Math;
import java.io.*;
import java.util.*;
/**
 *
 * @author Adeat
 */
public class Deaton_assignment5_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            System.out.println(sumOver(i));
        }
        char[] a = {'A', 'B', 'C', 'D', 'E'};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        reverseGivenIndex(a, 1, 4);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        String mom = "billy";
        System.out.println(PalindromeCheck.checkPalindrome(mom));
    }
    public static double sumOver(int n){
        if (n > 0){
            return Math.pow(n , -1) + sumOver(n-1);
        }
        else{ 
            return 0;
        }
    }
    public static char[] reverseGivenIndex(char[] input,int start,int end){
        Stack temp = new Stack();
        
        for(int i = start; i <= end; i++){
            temp.push(input[i]);
        }
        for(int i = start; i <= end; i++){
            input[i] = (Character)temp.pop();
        }
        return input;
    }
}
