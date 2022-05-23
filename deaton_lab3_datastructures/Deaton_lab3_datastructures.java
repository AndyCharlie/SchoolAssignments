/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab3_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_lab3_datastructures {

    
    public static void main(String[] args) {
        int check = addTo(7);
        System.out.println(check);
    }    
    public static int addTo(int num){
        int total = 0;
        for (int i=0; i <= num; i++){
            total += i;
        }
        return total;
    }
    
    
}


// addTo
// public static int addTo(int num)
// computes (1 + 2 + 3 + .... n) and returns the total
// Paramaters
// int num - and integer number to sum to
// Precondition
// int num > 0
// Returns (postcondition)
// sum of numbers to int num
// Throws: IllegalArgumentException
// indicates that int num < 0


// Algorithim
// intitialize a total varyable
// for every value up to and including given value (int num)
// add that number to the total
// return total

// Big O
// O(n)