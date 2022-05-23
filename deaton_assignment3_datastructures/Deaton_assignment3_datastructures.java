/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment3_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_assignment3_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int reciptTest1;
        int reciptTest2;
        int reciptTest3;
        int reciptTest4;
        int reciptTest5;
        int reciptTest6;
        int reciptTest7;
        int reciptTest8;
        
       StringBagWithRecipts test = new StringBagWithRecipts();
       reciptTest1 = test.add("item number one");
       reciptTest2 = test.add("item number two");
       reciptTest3 = test.add("item number three");
       reciptTest4 = test.add("item number four");
       reciptTest5 = test.add("item number five");
       reciptTest6 = test.add("item number six");
       reciptTest7 = test.add("item number seven");
       reciptTest8 = test.add("item number eight");
       
//        System.out.println(reciptTest1);
//        System.out.println(reciptTest2);
//        System.out.println(reciptTest3);
//        System.out.println(reciptTest4);
//        System.out.println(reciptTest5);
//        System.out.println(reciptTest6);
//        System.out.println(reciptTest7);
//        System.out.println(reciptTest8);
        while(i < 8){
            System.out.println(test.data[i]);;
            i++;
        }
        i=0;
        while(i < 8){
            System.out.println(test.recipt[i]);;
            i++;
        }
        i=0;
        test.remove(reciptTest2);
        while(i < 8){
            System.out.println(test.data[i]);
            i++;
        }
        i=0;
        while(i < 8){
            System.out.println(test.recipt[i]);
            i++;
        }
        i=0;
        test.remove(reciptTest3);
        while(i < 8){
            System.out.println(test.data[i]);
            i++;
        }
        i=0;
        while(i < 8){
            System.out.println(test.recipt[i]);
            i++;
        }
        i=0;
    }
}