/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment2_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_assignment2_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date2310 test = new Date2310(2, 28, 2000);
        System.out.println(test.toNumberFormat());
        test.incrimentDay();
        System.out.println(test.toNumberFormat());
        
    }
    
}
