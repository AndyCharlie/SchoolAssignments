/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment5_datastructures;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author Adeat
 */
public class PalindromeCheck {
    public static void main(String[] args) {
//      
//     using only one stack...
//
//        System.out.print("Enter any string:");
//        Scanner scanin = new Scanner(System.in);
//        String inputString = scanin.nextLine();
//        Stack stack = new Stack();
//
//        for (int i = 0; i < inputString.length(); i++) {
//            stack.push(inputString.charAt(i));
//        }
//
//        String reverseString = "";
//
//        while (!stack.isEmpty()) {
//            reverseString = reverseString + stack.pop();
//        }
//
//        if (inputString.equals(reverseString))
//            System.out.println("The input String is a palindrome.");
//        else
//            System.out.println("The input String is not a palindrome.");

        
        System.out.print("Enter any string:");
        Scanner scanin = new Scanner(System.in);
        System.out.println(checkPalindrome(scanin.nextLine().toLowerCase()));

    }
    
    public static boolean checkPalindrome(String input){
        Stack stack1 = new Stack();
        Stack forwardString = new Stack();
        Stack reverseString = new Stack();
        boolean isPalindrome = false;
        for(int i = 0; i < input.length(); i++){
            stack1.push(input.charAt(i));
            reverseString.push(input.charAt(i));
        }
        while(!stack1.isEmpty()){
            forwardString.push(stack1.pop());
        }
        while(!forwardString.isEmpty() && !reverseString.isEmpty()){
            if(forwardString.pop() == reverseString.pop()){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
        
    }
}
