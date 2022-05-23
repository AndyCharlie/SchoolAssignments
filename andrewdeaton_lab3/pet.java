
package andrewdeaton_lab3;
import java.util.Random;
public class pet {
    
            
     private String petName;
     private double petPrice;
     private int petWeight;
   
    public pet(String name, int weight){
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        petName = name;
        petWeight = weight;
        petPrice = (Math.random()*((890.50-550.0)+1))+550.0; 
        
    }
    public double getPrice(){
        return petPrice;
    }
    public void setPrice(double newPrice){
        petPrice = newPrice;
    }
    public String toString(){
        String result = "Pet Name: " + petName +
                       "\nPet Price:" + petPrice +
                       "\nPet Weight:" + petWeight;
        return result;
        
    }  
} 

