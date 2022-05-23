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
public class Deaton_Hwk6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Firearms[] inventory = new Firearms[4];
        inventory[0] = new Handgun("Colt" , .45 , 5.0);
        inventory[1] = new Handgun("Winchester" , 9 , 4.5);
        inventory[2] = new Handgun("Sig Sauer" , .40 , 3.5);
        inventory[3] = new Handgun("Glock" , 9 , 5.0);
        
        for (int i = 0; i < inventory.length; i++){
            Class myclass = inventory[i].getClass();
            System.out.println("Class Name: " + myclass.getSimpleName());
            inventory[i].getPrice();
            System.out.println(inventory[i].toString());
            
        }
        System.out.println("Total Firarms: " + Firearms.getTotalFirearms());
    }
    
    
    
}
    

