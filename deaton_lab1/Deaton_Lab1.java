
package deaton_lab1;

import java.util.Scanner;

public class Deaton_Lab1 {

    
    public static void main(String[] args) {
        int choice;
        double temp;
        
        Scanner scanIn = new Scanner(System.in);
        
        System.out.println("Tempature Converter:");
        System.out.println("Enter 1 to convert Celsius to Fahrenheit, 2 for Farenheit to Celsius, or 3 for Celsius to Kelvin.");
        choice = scanIn.nextInt();
        System.out.println("Enter Tempature to be converted.");
        temp = scanIn.nextDouble();
        
        switch(choice) {
            case 1:
                temp = ((temp * (9/5)) + 32);
                break;
            case 2:
                temp = ((temp-32) * (5/9));
                break;
            case 3:
                temp = (temp + 273.15);
                break;
            default:
                System.out.println("There was an error with your conversion selection, please try again.");
                break;
        }
        System.out.println("Your converted tempature is: " + temp);
    }
    
}
