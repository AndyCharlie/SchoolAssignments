/*
//  Andrew Deaton
//
// Combination Lock Simulator
// public Lock (int p1, int p2, int p3)
// Simulates a Combination Lock
// Paramaters
// private int currentNumber, an int datatype storing the "top" number of the combination lock
// private int com1, com2, and com3, each containing the first, second and third solution to the combination respectively.
// private boolean try0, initialized to true. used to distinguish the first move from the third move.
// private boolean try1, try2, and try3 initialized to false, after each attempt there is a check to see if the attempt sucessfully landed on a number of the combination, if so set to true
// private boolean locked initialized on creation of obj to true, used to check if lock has been unlocked or not
// Precondition
// int com1, com2, and com3
// or none in witchcase com1 com2 and com3 will be initialized with random values 1 - ( MAX_LOCKSIZE - 1)
// 
// 
 */
package deaton_lab4_datastructures;
import java.util.Random;
/**
 *
 * @author Adeat
 */
public class Lock {
    final private int MAX_LOCKSIZE = 10;                                            // final MAX_LOCKSIZE can be changed to any value and lock will function as it should.
    private int currentNumber = 0;
    private int com1, com2, com3;
    private boolean try0 = true; 
    private boolean try1, try2, try3 = false;
    private boolean locked;
    
    
    public Lock (int p1, int p2, int p3){
        com1 = p1;
        com2 = p2;
        com3 = p3;
        locked = true;
    }
    public Lock (){
        Random rand = new Random();
        
        com1 = rand.nextInt(MAX_LOCKSIZE);                                          // if no arguments are passed then just create a random comb with random 0-9
        com2 = rand.nextInt(MAX_LOCKSIZE);
        com3 = rand.nextInt(MAX_LOCKSIZE);
        locked = true;
        
    }
    
    private void setCombination(int p1, int p2, int p3){
        com1 = p1;
        com2 = p2;
        com3 = p3;
        resetChecks();
    }
    
    public void turnClockwise(int ticks){
        if(try0){                                                                                                // by using the try0 that was set true on class creation, i can use that to tell if it is the
            currentNumber = ((MAX_LOCKSIZE - ticks % MAX_LOCKSIZE) + currentNumber) % MAX_LOCKSIZE;              // first time that the method turnClockwise is called, and update the corosponding "try check"
            if (com1 == currentNumber){
                try1 = true;
                try0 = false;                                                                 // setting the try0 to false after any outcome, so then next time any method is
            }                                                                                 // called it will not allow try1 too be updated after that try has been used.
            else {
                try1 = false;
                try0 = false;
            }
        }
        else{
            currentNumber = ((MAX_LOCKSIZE - ticks % MAX_LOCKSIZE) + currentNumber) % MAX_LOCKSIZE;
            if(com3 == currentNumber && ticks <= MAX_LOCKSIZE){                                 // the check for rotation only needs to be done after try0 is false, because you could
                try3 = true;                                                                    // spin the dial for as many times as you wanted CW for the first time and as long as you landed on 
                try0 = false;                                                                   // the proper number it would still work.
            }
            else{
                try3 = false;
                try0 = false;
            }
        }
    }
    
    public void turnCounterClockwise(int ticks){
        currentNumber = (currentNumber + ticks % MAX_LOCKSIZE) % MAX_LOCKSIZE;
        if ( 2*MAX_LOCKSIZE >= ticks && ticks > MAX_LOCKSIZE && com2 == currentNumber){         // 20 => ticks > 10 must be true, becuase the lock must only work if it is the second time the number is at the "top"
            try2 = true;                                                                        // and could be exactly 20 ticks, but not more on the CW turn
            try0 = false;
        }
        else{
            try2 = false;
            try0 = false;
        }
    }
    
    public int getCurrentNumber(){
        return currentNumber;
    }
    
    public boolean isLocked(){
        return locked;
    }
    
    public void closeLock(){
        locked = true;
        resetChecks();
    }
    
    public void attemptLock(){
        if (try1 && try2 && try3){
            System.out.println("The lock falls to the floor, revealing your treasure.");
            locked = false;
        }
        else{
            System.out.println("You failed to input correct combination. Please try again.");
            resetChecks();
        }
    }
    @Override
    public String toString(){
         String out = "Combination: " + com1 + ", " + com2 + ", " + com3 + "\n" +
                      "Try: " + "1:" + try1 + ", " +  "2:" + try2 + ", " + "3:" + try3 + ", " + "\n";
         return out;
                       
    }
    private void resetChecks(){
        try0 = true;
        try1 = false;
        try2 = false;
        try3 = false;
    }
    
}
