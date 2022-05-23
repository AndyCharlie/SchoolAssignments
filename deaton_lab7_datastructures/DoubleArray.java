/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab7_datastructures;
/**
 *
 * @author Adeat
 */
public class DoubleArray {
    
    private Double[] positive;
    private Double[] negative;
    
    public DoubleArray(int capacity){
        positive = new Double[capacity];
        nullFill(positive);
        negative = new Double[capacity];
        nullFill(negative);
    }
    
    // boundary would be max int value
    
    public void put(double input, int index){
        if(positive.length <= Math.abs(index)){
            ensuresCapacity((Math.abs(index)*2) + 1);
        }
        if (index < 0){
            negative[(Math.abs(index))] = input;
        }
        else if(index == 0){
            positive[index] = input;
            negative[index] = input;
        }
        else{
            positive[index] = input;
        }
    }
    
    // in this case boundary is (maxint - 1) / 2, because if not, the int will overflow when trying to be passed to the ensuresCapacity method
    // also bounded by max double value
    public double get(int index){
        double result;
        try{
            if ((index < 0)){
                result = negative[(Math.abs(index))];
            }
            else if(index == 0){
                result = positive[index];
            }
            else{
                result = positive[index];
            }
        }
        catch (Exception arrayOutOfBounds){
            result = Double.NaN;
        }
        return result;
    }
    private void nullFill(Double[] doubleArray){
        for(int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = Double.NaN;
        }
    }
    private void ensuresCapacity(int minimum){
        Double[] biggerPositive;
        Double[] biggerNegative;
        if (positive.length < minimum){
            biggerPositive = new Double[minimum];
            nullFill(biggerPositive);
            biggerNegative = new Double[minimum];
            nullFill(biggerNegative);
            System.arraycopy(positive, 0, biggerPositive, 0, positive.length);
            System.arraycopy(negative, 0, biggerNegative, 0, negative.length);
            negative = biggerNegative;
            positive = biggerPositive;
        }
    }
    // bounded by max int value
    
    
}
