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
public class Triangle2310 {
    Point2D2310 point1;
    Point2D2310 point2;
    Point2D2310 point3;
    
    public Triangle2310(Point2D2310 point1, Point2D2310 point2, Point2D2310 point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public boolean equals(Triangle2310 input){
        if((input.point1.equals(point1)) && (input.point2.equals(point2)) && (input.point3.equals(point3))){
            return true;
        }
        else{
            return false;
        }
    }
}
