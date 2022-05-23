/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab3_datastructures1;

/**
 *
 * @author Adeat
 */
public class Deaton_lab3_datastructures1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    matrixPrint(10);
    }
    public static void matrixPrint(int num){
        for(int i = 0; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
       
    }
}

// matrix Print
// public static void matrixPrint(int num)
// returns a matrix size n by n, filled 1, 2, 3, ..., n
// Paramaters
// int num - and integer number as given size for matrix
// Precondition
// int num >= 1
// Returns (postcondition)
// Matrix size n by n
// Throws: IllegalArgumentException
// indicates that int num < 1


// Algorithim
// loop for each integer number from 0 to given int num
// nested loop for each integer number 1 ( as said in assignment to only print 1 to n) to given int num and print the value
// outside of second loop, print a new line before looping again

// Big O
// O(n^2)
    



// PROBLEM 3
// program 1 ( sum ) will be the faster program because it has less steps to do, and the calculation from the big O shows this.