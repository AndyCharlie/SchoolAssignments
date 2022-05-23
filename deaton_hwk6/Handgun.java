/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk6;

/**
 *
 * @author Adeat
 */
public class Handgun extends Firearms {
    double barrelLength;
    double price;
    private static int handgunCount = 0;

    public Handgun(String manufacturer, double ammunitionType, double barrelLength){
        super(manufacturer, ammunitionType);
        this.barrelLength = barrelLength;
        this.setPrice(price);
        handgunCount++;
}
    //ehh idk price depends on barrel length i guess at $300 an inch
    public double getPrice(){
        price += barrelLength * 300.0; 
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getBarrelLength(){
        return barrelLength;
    }
    public void setBarrelLength(double barrelLength){
        this.barrelLength = barrelLength;
    }
    @Override
    public String toString(){
       String output = (Handgun.super.toString() + "\n" + 
                        "Barrel Length: " + barrelLength + "\n");
       return output;
    }
}