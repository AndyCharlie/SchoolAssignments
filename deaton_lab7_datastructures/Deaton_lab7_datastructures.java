/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab7_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_lab7_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleArray test = new DoubleArray(10);
        test.put(1.9 , -9);
        test.put(1.8 , -8);
        test.put(1.7 , -7);
        test.put(1.6 , -6);
        test.put(1.5 , -5);
        test.put(1.4 , -4);
        test.put(1.3 , -3);
        test.put(1.2 , -2);
        test.put(1.1 , -1);
        test.put(1.0 , 0);
        test.put(0.9 , 1);
        test.put(0.8 , 2);
        test.put(0.7 , 3);
        test.put(0.6 , 4);
        test.put(0.5 , 5);
        test.put(0.4 , 6);
        test.put(0.3 , 7);
        test.put(0.2 , 8);
        test.put(0.1 , 9);
     
        
        System.out.println(test.get(-9));
        System.out.println(test.get(-8));
        System.out.println(test.get(-7));
        System.out.println(test.get(-6));
        System.out.println(test.get(-5));
        System.out.println(test.get(-4));
        System.out.println(test.get(-3));
        System.out.println(test.get(-2));
        System.out.println(test.get(-1));
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        System.out.println(test.get(4));
        System.out.println(test.get(5));
        System.out.println(test.get(6));
        System.out.println(test.get(7));
        System.out.println(test.get(8));
        System.out.println(test.get(9));
        test.put(0.0 , 14);
        
        System.out.println(test.get(17));
    }
    
}
