/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_midterm;

/**
 *
 * @author Adeat
 */
public class Tripple2310 {
    int MAX_SIZE = 3;
    int[] tripple = new int[MAX_SIZE];
    
    public Tripple2310(){
        tripple[0] = 1;
        tripple[1] = 2;
        tripple[2] = 3;
    }
    // Tripple2310
    // public Tripple2310()
    // initalizes a Tripple2310 class with 3 values
    // Parameters:
    // Precondition:
    // Returns:
    // Tripple2310 that has been initialized with 3 values in an array
    
    public Tripple2310 reverse(){
        Tripple2310 out = new Tripple2310();
        for(int i = 0; i < 3; i++){
            out.tripple[MAX_SIZE - 1 - i] = tripple[i];
        }
        return out;
    }
    
    // Tripple2310
    // public Tripple2310 reverse()
    // initalizes a Tripple2310 class with the values from the given in reverse
    // Parameters:
    // Precondition:
    // Returns:
    // Tripple2310 that has its value reversed from the given
    
    public int getLast(){
        return tripple[MAX_SIZE - 1];
    }
    
    // Tripple2310
    // public int getLast()
    // returns the last tripple value
    // Parameters:
    // Precondition:
    // Returns:
    // last value for tripple in array
    
}
