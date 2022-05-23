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
public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public boolean equalsPoint(Point compare){
        if((compare.x == x) && (compare.y == y)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean comparePointArray(Point[] array1, Point[] array2){
        if(array1.length != array2.length){
            return false;
        }
        else{
            for(int i = 0; i < array1.length; i++){
                if (!array1[i].equalsPoint(array2[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
