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
public class Point3D2310 {
    private Point2D2310 p;
    private int z;
    int getZ (){
        return z;
    }
    void setZ (int newZ){
        z = newZ;
    }
    Point2D2310 getP(){
        return p;
    }
    void setP(Point2D2310 newP){
        p = newP;
    } 
    public Point3D2310 clone() throws CloneNotSupportedException{
        Point2D2310 copy = new Point2D2310();
        Point3D2310 out = new Point3D2310();
        copy.setX(p.getX());
        copy.setY(p.getY());
        out.setP(copy);
        out.setZ(getZ());
        return out;
        
    }
   // initializng a 2d and 3d object to begin deep copying to.
   // pulling out the values of the origional 2D obj and putting then in a new 2D obj (TRUE CLONE, NOT MEM ADDRESS)
   // setting the 2D obj in the 3D obj class to the 2D obj we created, then passing the z value of the old into the copy
   // returning the address of the new object that was cloned

}

