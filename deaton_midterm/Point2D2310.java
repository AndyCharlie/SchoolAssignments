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
public class Point2D2310 {
    private int x;
    private int y;
    public int getX(){
        return x;
    }
    public Point2D2310(){
        x = 0;
        y = 0;
    }
    public boolean equals(Point2D2310 input){
        if(getY() == input.getY() && getX() == input.getX()){
            return true;
        }
        else{
            return false;
        }
    }
    public int getY(){
        return y;
    }
    public void setX(int newX){
        x = newX;
    }
    public void setY(int newY){
        x = newY;
    }  

}

