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
public class Point {
    int x;
    int y;  


    public Point(){
        x = 0;
        y = 0;
}
    public void setPoint(int x ,int y){
        this.x = x;
        this.y = y;
    }
    
    public int getXPoint(){
        return x;
    }
    public int getYPoint(){
        return y;
    }
    public Point clonePoint(){
        Point cp = new Point();
        cp.x = this.x;
        cp.y = this.y;
        return cp;    
    }
    
    //public void clonePoint(Point Z){
    //    this.x = Z.getXPoint();
    //    this.y = Z.getYPoint();  
    //}
    
    @Override
    public String toString(){
        String out = ("( " + x + " )" + "( " + y + " )");
        return out;
       
    }
    }