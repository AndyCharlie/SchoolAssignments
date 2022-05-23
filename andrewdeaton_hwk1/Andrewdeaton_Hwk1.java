/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrewdeaton_hwk1;

import java.util.Scanner;

public class Andrewdeaton_Hwk1 {

 
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        
        System.out.println("Problem 1:");
        System.out.println("Enter Degree Name:");
            String degree;
            degree = scanIn.nextLine();
        System.out.println("Enter grade for course 1:");
            double course1 = scanIn.nextDouble();
        System.out.println("Enter grade for course 2:");
            double course2 = scanIn.nextDouble();
        System.out.println("Enter grade for course 3:");
            double course3 = scanIn.nextDouble();
        System.out.println("Enter grade for course 4:");
            double course4 = scanIn.nextDouble();
            double avggrade = ((course1 + course2 + course3 + course4) / 4);
        System.out.println("Degree\t\tSemester GPA\n" + degree + "\t\t" + avggrade);
        if (avggrade >= 2.8){
            System.out.println("You're in good standing!");
        }
        else {
            System.out.println("You're not in good standing.");
        }
        
        //**************************************************************************//
        //**************************************************************************//
        
        System.out.println("Problem 2:");
        System.out.println("Enter a capital letter:");
        char capletter = scanIn.next().charAt(0);
        int capcheck = capletter;
        //Check ASCII codes
        if ((65 <= capcheck) && (capcheck <= 90)) {
            System.out.println("Thank you, " + capletter + " ,is a capital letter");
        }
        else {
            System.out.println(capletter + " is not a capital letter.");
        }
        
        //**************************************************************************//
        //**************************************************************************//
        
        System.out.println("Problem 3:");
        System.out.println("Enter an integer:");
        int evennum = scanIn.nextInt();
        if ((evennum % 2) == 0){
            System.out.println(evennum + " is an even number");
        }
        else {
            System.out.println(evennum + " is an odd number");
        }
        
        //**************************************************************************//
        //**************************************************************************//
        
        System.out.println("Problem 4:");
        final double HOURSINYEAR = 3760.0;
        System.out.println("Enter your age:");
        double age = scanIn.nextDouble();
        double agehours = age * HOURSINYEAR;
        System.out.println("Your age in years:\t" + age + "\nYour age in hours:\t" + agehours);
        
        //**************************************************************************//
        //**************************************************************************//
        
        System.out.println("Problem 5:");
        System.out.println("Enter an integer:");
        int a = scanIn.nextInt();
        System.out.println("Enter another integer:");
        int b = scanIn.nextInt();
        double c = a; // only casting one becasue it defaults after that
        double aoverb = c / b;
        double bovera = b / c;
        System.out.println("Int division: " + a + "/" + b + " = " + (a / b));
        System.out.println("Int division: " + b + "/" + a + " = " + (b / a));
        System.out.println("Data conversion division: " + a + "/" + b + " = " + aoverb);
        System.out.println("Data conversion division: " + b + "/" + a + " = " + bovera);
    }
    
}
