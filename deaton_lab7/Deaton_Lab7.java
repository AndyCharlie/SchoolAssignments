/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab7;

/**
 *
 * @author Adeat
 */
public class Deaton_Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToyStore one = new ToyStore("puzzle", 27.50, "HL980-7", "Acme Gadgets Co", "555-555-1010", "Texas");
        ToyStore two = new ToyStore("model", 32.50, "R888-1", "Detroit Car Models", "555-213-1010" , "Michigan");
        System.out.println(one.toString());
        System.out.println(two.toString());
    }
    
}
