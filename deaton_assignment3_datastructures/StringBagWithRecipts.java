/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment3_datastructures;

/**
 *
 * @author Adeat
 */
public class StringBagWithRecipts {
    public String[] data;
    private int manyItems;
    public int[] recipt;
    public StringBagWithRecipts (int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException ("initial capacity not valid");
        }
            manyItems = 0;
            data = new String[initialCapacity];
            recipt = new int[initialCapacity];
    }
    public StringBagWithRecipts (){
        final int INITIAL_CAPACITY = 10;
        manyItems = 0;
        data = new String[INITIAL_CAPACITY];
        recipt = new int[INITIAL_CAPACITY];
    }
    public int add(String element){
        int tempRecipt;
        if (manyItems == data.length){
            ensureCapacity(manyItems*2 + 1);
        }
        data[manyItems] = element;
        recipt[manyItems] = manyItems;
        tempRecipt = recipt[manyItems];
        manyItems++;
        return tempRecipt;
    }
    public void ensureCapacity(int minimumCapacity){
        String[] SbiggerArray;
        int[] biggerArray;
        if (data.length < minimumCapacity){
            SbiggerArray = new String[minimumCapacity];
            System.arraycopy(data, 0, SbiggerArray, 0, manyItems);
            data = SbiggerArray;
            biggerArray = new int[minimumCapacity];
            System.arraycopy(recipt, 0, biggerArray, 0, manyItems);
            recipt = biggerArray;
        }
    }
    public int getCapacity(){
        return data.length;
    }
    public String remove(int givenRecipt){
        int index = 0;
        String out;
        while((index < manyItems) && (givenRecipt != recipt[index])){
            index++;
        }
        if (index == manyItems){
            out = "N/A";
        }
        else{
            manyItems--;
            out = data[recipt[index]];
            data[recipt[index]] = data[manyItems];
            recipt[index] = recipt[manyItems];
        }
        return out;
    }
    public int size(){
        return manyItems;
    }
    public void trimToSize(){
        String[ ] trimmedArray;
        int[] trimmedRecipt;
        if (data.length != manyItems){
            trimmedArray = new String[manyItems];
            System.arraycopy(data, 0, trimmedArray, 0, manyItems);
            data = trimmedArray;
            trimmedRecipt = new int[manyItems];
            System.arraycopy(recipt, 0, trimmedRecipt, 0, manyItems);
            recipt = trimmedRecipt;
        }
    }

}
