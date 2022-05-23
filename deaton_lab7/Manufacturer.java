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
public class Manufacturer {
    String name;
    String phone;
    String state;
    
    public Manufacturer(String mname, String mphone, String mstate){
        name = mname;
        phone = mphone;
        state = mstate;
        
    }
    public String toString(){
        String out = ("Company :" + name + "\n" +
                            "   " + "Phone Number: " + phone + "\n" +
                            "   " + "State: " + state);
        return out;
    }
    
}
