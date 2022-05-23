
package andrewdeaton_lab2;

import java.util.Scanner;

public class AndrewDeaton_Lab2 {

   
    public static void main(String[] args) {
    
        Scanner scanIn = new Scanner(System.in);
        String HIGHSCHOOL_TOWN = "North Branch";
        System.out.println("I went to highschool in " + HIGHSCHOOL_TOWN);
        System.out.println("Enter a positive integer:");
        int a = scanIn.nextInt();
        System.out.println("Enter another positive integer:");
        int b = scanIn.nextInt();
        if (a > b) {
            System.out.println("The larger of the two integers entered is " + a);
        }
        else {
            System.out.println("The larger of the two integers entered is " + b);
        }
        double c = a; // only casting one becasue it defaults after that
        double aoverb = c / b;
        double bovera = b / c;
        System.out.println("Int division: " + a + "/" + b + " = " + (a / b));
        System.out.println("Int division: " + b + "/" + a + " = " + (b / a));
        System.out.println("Data conversion division (casting): " + a + "/" + b + " = " + aoverb);
        System.out.println("Data conversion division (casting): " + b + "/" + a + " = " + bovera);
        int formula = ((a+b)*400);
        System.out.println("The result of the formula is " + formula);
    }
    
}
