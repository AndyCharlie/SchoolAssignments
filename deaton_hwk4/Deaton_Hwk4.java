/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk4;

/**
 *
 * @author Adeat
 */
public class Deaton_Hwk4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std1 = new Student("Andrew", "Deaton", 'C' , 3.2, "Oakland Grizzlies", "Grizz", "Gold");
        Student std2 = new Student("Olivia", "Phillips", 'L', 3.9, "Grand Valley Lakers", "Louie the Laker", "Blue");
        Student std3 = new Student("Griffin", "Phillips", 'L', 3.2, "North Branch Broncos", "Bronco", "Blue");
        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());
        System.out.println(std1.getFirst() + " has same last name as " + std2.getFirst() + ": " + std1.sameLast(std2));
        System.out.println(std2.getFirst() + " has same last name as " + std3.getFirst() + ": " + std2.sameLast(std3));
    }
    
}
