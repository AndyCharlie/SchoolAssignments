/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab6_datastructures;

/**
 *
 * @author Adeat
 */
public class Deaton_lab6_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5,6,7,8};
        int[] test2 = {1,2,3,4,5,6,7,9};
        
        Point a,b,c,d,e,f;
        a = new Point(1,2);
        b = new Point(2,2);
        c = new Point(3,2);
        d = new Point(1,2);
        e = new Point(2,2);
        f = new Point(3,2);
        
        Point[] arrayPoints1 = {a ,b, c};
        Point[] arrayPoints2 = {d ,e, f};
        
        System.out.println(Point.comparePointArray(arrayPoints1, arrayPoints2));
        //Point.comparePointArray(arrayPoints1, arrayPoints2)
        //System.out.println(compareArray(test1, test2));
    }
    public static boolean compareArray(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        else{
            for(int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
