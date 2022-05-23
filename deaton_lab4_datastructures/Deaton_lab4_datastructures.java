/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab4_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_lab4_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lock combTest = new Lock(3, 5, 0);
        combTest.turnClockwise(7);
        System.out.println(combTest.getCurrentNumber());
        combTest.turnCounterClockwise(12);
        System.out.println(combTest.getCurrentNumber());
        combTest.turnClockwise(5);
        System.out.println(combTest.getCurrentNumber());
        combTest.attemptLock();
        System.out.println(combTest.toString());
    }
    
}
