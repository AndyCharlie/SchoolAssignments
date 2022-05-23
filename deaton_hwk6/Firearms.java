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
public abstract class Firearms {
    String manufacturer;
    double ammunitionType;
    private static int numOfFirearms = 0;
    
    
    public Firearms(String manufacturer, double ammunitionType){
        this.manufacturer = manufacturer;
        this.ammunitionType = ammunitionType;
        numOfFirearms++;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public double getAmmunitionType(){
        return ammunitionType;
    }
    public void setAmmunitionType(double ammunitionType){
        this.ammunitionType = ammunitionType;
    }
    public static int getTotalFirearms(){
        return numOfFirearms;
    }
    public abstract double getPrice();
    public abstract void setPrice(double newPrice);
    @Override
    public String toString(){
        String output = ("Manufacturer: " + manufacturer + "\n" + 
                         "Ammunition Type: " + ammunitionType + "\n" + 
                         "Price: " + getPrice());
        return output;
    }
}
