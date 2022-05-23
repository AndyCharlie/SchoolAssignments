/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk2;

import javafx.scene.paint.Color;
import java.util.Random;
/**
 *
 * @author Adeat
 */
public class GetRandomValues {
    Color newColor;
    String colorName;
    int width;
    int height;
    
    public GetRandomValues(int minWid, int maxWid,int minHt, int maxHt,String clr) {
        Random rand = new Random();
        
        int heightRange = (maxHt - minHt);
        int widthRange = (maxWid - minWid);
        width = rand.nextInt(widthRange + 1) + minWid;
        height = rand.nextInt(heightRange + 1) + minHt;
    
        
        switch (clr) {
            case "RED":
                newColor = (Color.RED);
                colorName = clr;
                break;
            case "BLUE":
                newColor = (Color.BLUE);
                colorName = clr;
                break;
            default:
                newColor = (Color.MAGENTA);
                colorName = "MAGENTA";
                break;
        }
}
    
    public Color getNewColor(){
        return newColor;
    }
    public String getColorName(){
        return colorName;
    }
    public int getWidth(){
       return width; 
    }
    public int getHeight(){
       return height; 
    }
    public String toString(){
        String result = ("Width: " + width + "\n"
                         + "Height: " + height + "\n"
                         + "Color: " + colorName);
        return result;
    }
}
