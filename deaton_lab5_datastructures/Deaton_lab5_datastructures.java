/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab5_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_lab5_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //int [] a, b;                                     // this is initializing 2references to integer arrays (a and b), then assigning array a a size of 10. setting the 6th element in the a 
       //a =  new int[10];                                // array to 0. Then setting the reference address to the location of memory b is changed to the reference address of a,
       //a[5] = 0;                                        // then setting the 6th element to the integer 42 and then printing the 6th element of the array of b, but because we set 
       //b = a;                                           // the reference address to the location of memory b was changed to a's, it returnes the value from a
       //a[5] = 42;
       //System.out.println(b[5]);
       
       
       //int[] a, b;                                      // this is initializing 2 integer arrays (a and b), then assigning array a a size of 10. setting the 6th element in the a 
       //a = new int [10];                                // array to 0. then we are invoking the clone method to properly create a copy of a and storing that data into b.
       //a[5] = 0;                                        // then setting the 6th element to the integer 42 and then printing the 6th element of the array of b, this time printing 0
       //b = a.clone();                                   // because b was made a copy of a before the change to a happened, so it is still holding the value of witch it was cloned at.
       //a[5] = 42;
       //System.out.println(b[5]);

       Point A, B;
       A = new Point();
       A.setPoint(2, 4);
       B = A.clonePoint();
       A.setPoint(3, 5);
       System.out.println(B.toString());
       
       
        
        
        
        
        
    }
    
    
    
}
