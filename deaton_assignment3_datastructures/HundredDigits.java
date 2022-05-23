/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment3_datastructures;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Adeat
 */
public class HundredDigits {
    int[] digits;
    int sign = 1;
    int length;
    
    public HundredDigits(int input){
        length = (int)(Math.log10(Math.abs(input))+1);
        int[] arrayOfDigits;
        arrayOfDigits = new int[length];
        if (input < 0){
            sign = -1;
        }
        for (int i = 0; i < length; i++){
            arrayOfDigits[((length - 1) - i)] = Math.abs(input % 10);
            input = input / 10;
        }
        digits = arrayOfDigits;
    }
    public HundredDigits(int[] input, int inputsign){
        length = input.length;
        int[] arrayOfDigits = new int[length];
        for(int i = 0; i < length; i++){
            arrayOfDigits[i] = input[i];
        }
        sign = inputsign;
        digits = arrayOfDigits;
    }
    public HundredDigits(){
        int[] arrayOfDigits;
        length = 100;
        Random rand = new Random();
        arrayOfDigits = new int[length];
        for (int i = 0; i < length; i++){
            arrayOfDigits[i] = rand.nextInt(10);
        }
        if(rand.nextBoolean()){
            sign = -1;
        }
        digits = arrayOfDigits;
    }
    @Override
    public String toString(){
        String out = Arrays.toString(digits);
        return out;
    }
    public HundredDigits add(HundredDigits input){
        HundredDigits result;
        int[] output;
        int largeLength;
        int carry = 0;
        int resultsign = 1;
        int a;
        int b;
        int total = 0;
        if(digits.length < input.digits.length){
            largeLength = input.digits.length;
        }
        else{
            largeLength = digits.length;
        }
        output = new int[(largeLength + 1)];
        for(int i = 0; i <= largeLength; i++){
            if(((digits.length - 1 ) - i) < 0 ){
                a = 0;
            }
            else{
                a = sign * (digits[(digits.length - 1) - i]);
            }
            if(((input.digits.length - 1) - i) < 0){
                b = 0;
            }
            else{
                b = input.sign * ((input.digits[(input.digits.length - 1) - i]));
            }
            carry += Math.abs(((a) + (b))/10);
            total = ((a) + (b) + carry) % 10;
            if(total < 0){
                total = (10 - total) % 10;
                carry = -1;
            }
            else if(total == 0){
                carry = 0;
            }
            else {
                //total = (10 - total) % 10;
                carry = 1;
            }
            if (a == 0){
                total = (b); //+ carry;
            }
            if (b == 0){
                total = (a); //+ carry;
            }
            
            System.out.println(" a :" + a + " b :" + b + " total: "+ total + " carry into next: " + carry);
//            System.out.println(" b :" + b);
//            System.out.println("total: "+ total);
//            System.out.println("carry into next: " + carry);
            
            output[(largeLength) - i] = Math.abs((total) % 10);          
            while((a + b + carry) < 0){
                resultsign = -1;
                break;
            }
        }
      
        result = new HundredDigits(output, resultsign);
        return result;
    }
}
