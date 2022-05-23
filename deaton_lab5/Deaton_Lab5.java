/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab5;

import java.io.IOException;
import java.io.File;
import java.util.*;
/**
 *
 * @author Adeat
 */
public class Deaton_Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int index = 0;
        double ammOwed;
        String patient;
        double groupAowed = 0;
        double groupBowed = 0;
        int numPatientsA = 0;
        int numPatientsB = 0;
        Scanner fileIn = new Scanner(new File("wednesday.txt"));
        ArrayList<String> patientID = new ArrayList();
        ArrayList<Double> owed = new ArrayList();
        
        while (fileIn.hasNext()){
            ammOwed = fileIn.nextDouble();
            patient = fileIn.next();
            patientID.add(patient);
            owed.add(ammOwed);
            
        }
        fileIn.close();
        System.out.println("Patient: " +  "Ammount Owed;");
        while (index < patientID.size()){
           System.out.println(patientID.get(index) + "\t" + owed.get(index));
            index++;
        }
        index = 0;
        while (index < patientID.size()){
            patient = patientID.get(index);
            
            switch (patient.charAt(0)){
                case ('A'):
                    groupAowed += owed.get(index);
                    numPatientsA++;
                    break;
                case ('B'):
                    groupBowed += owed.get(index);
                    numPatientsB++;
                    break;
                default:
                    System.out.println("Oops...");
                    break;
            }
            index++;
        }
        
        System.out.println("Average ammount due for group A is: " + (groupAowed / numPatientsA));
        System.out.println("Average ammount due for group B is: " + (groupBowed / numPatientsB));
        
    }
    
}
