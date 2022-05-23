/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab7;

/**
 *
 * @author Adeat
 */
public class ToyStore {
    String category;
    Double price;
    String model;
    static int count ;
    Manufacturer company;
    
    public ToyStore (String scategory, double sprice, String smodel, String companyName, String sphone, String sstate){
        category = scategory;
        price = sprice;
        model = smodel;
        company = new Manufacturer(companyName, sphone, sstate);
        count++;
    }
    public String toString(){
        String out = ("Toy Category: " + category + "\n" +
                       "Price: $" + price + "\n" +
                       "Model Number: " + model + "\n" +
                       "Quantity of Products offered: " + count + "\n" + (company.toString()));
        return out;
        
    }
}
