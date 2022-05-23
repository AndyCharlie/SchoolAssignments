/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adeat
 */
public class Deaton_Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int multiple;
        double totalorig = 0.0;
        double totalmultp = 0.0;
        double[] prices = new double[6];
        prices[0] = 199.99;
        prices[1] = 37.45;
        prices[2] = 275.95;
        prices[3] = 12.13;
        prices[4] = 3.49;
        prices[5] = 349.95;
        
        //creating class to format doubles for currency
        DecimalFormat decimalFormat =  new DecimalFormat("#0.00"); 
        
        
        System.out.println("Enter an integer multiple: ");
        multiple = scanIn.nextInt();
        
        
        //totaling origional values
        for (int i = 0; i <= 5; i++){
            totalorig = totalorig + prices[i];
        }
        
        //printing origional values and its total
        System.out.println("Origional Prices:");
        for (double temp: prices){
            System.out.println("$" + decimalFormat.format(temp));
        }
        System.out.println("Sum: " + "$" + decimalFormat.format(totalorig) + "\n");
        
        //applying the multiple
        for (int i = 0; i <= 5; i++) {
            prices[i] = prices[i] * multiple;
        }
        
        //printing post multiple
        System.out.println("Prices after being multiplied by: " + multiple);
        for (double temp: prices){
            System.out.println("$" + decimalFormat.format(temp));
        }
        
        //totaling post multiple
        for (int i = 0; i <= 5; i++){
            totalmultp = totalmultp + prices[i];
        }
        
        //printing total
        System.out.println("Sum: " + "$" + decimalFormat.format(totalmultp) + "\n");
        
    }
    
    
}
