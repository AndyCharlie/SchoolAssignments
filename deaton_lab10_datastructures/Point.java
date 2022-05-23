/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab10_datastructures;

/**
 *
 * @author Adeat
 */
public class Point <X, Y> {
    private X x;
    private Y y;
    
    public Point (X x,Y y) {
	this.x = x;
        this.y = y;
    }

    public static void Compare(Point P1, Point P2) {
		
        if (P1.x.equals(P2.x)  && P1.y.equals(P2.y) ){
            System.out.println("Points are equal");
	}
	else {
            System.out.println("Points are not equal");
        }
    } 
}
