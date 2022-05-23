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
public class IntArrayBag implements Cloneable {
    private int[] data;
    private int manyItems;
    public IntArrayBag (int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException ("initial capacity not valid");
        }
            manyItems = 0;
            data = new int[initialCapacity];
    }
    public IntArrayBag (){
        final int INITIAL_CAPACITY = 10;
        manyItems = 0;
        data = new int[INITIAL_CAPACITY];
    }
    public void add(int element){
        if (manyItems == data.length){
            // Double the capacity and add 1; this works even if manyItems is 0. However, in
            // the case that manyItems*2 + 1 is beyond Integer.MAX_VALUE, there will be an
            // arithmetic overflow and the bag will fail.
            ensureCapacity(manyItems*2 + 1);
        }
        data[manyItems] = element;
        manyItems++;
    }
    public void addAll(IntArrayBag addend){
        // If addend is null, then a NullPointerException is thrown.
        // In the case that the total number of items is beyond Integer.MAX_VALUE, there will
        // be an arithmetic overflow and the bag will fail.
        ensureCapacity(manyItems + addend.manyItems);
        System.arraycopy(addend.data, 0, data, manyItems, addend.manyItems);
        manyItems += addend.manyItems;
    }
    public void addMany(int... elements){
        if (manyItems + elements.length > data.length){
            // Ensure twice as much space as we need.
            ensureCapacity((manyItems + elements.length)*2);
        }
        System.arraycopy(elements, 0, data, manyItems, elements.length);
        manyItems += elements.length;
    }
    public IntArrayBag clone(){
        IntArrayBag answer;
        try{
            answer = (IntArrayBag) super.clone( );
        }
        catch (CloneNotSupportedException e){
            // This exception should not occur. But if it does, it would probably indicate a
            // programming error that made super.clone unavailable. The most common
            // error would be forgetting the “Implements Cloneable” clause at the start of
            // this class.
            throw new RuntimeException("This class does not implement Cloneable.");
        }
        answer.data = data.clone( );
        return answer;
    }
    public int countOccourances(int target){
        int answer;
        int index;
        answer = 0;
        for (index = 0; index < manyItems; index++){
            if (target == data[index]){
                answer++;
            }
        }    
        return answer;
    }
    public void ensureCapacity(int minimumCapacity){
        int[] biggerArray;
        if (data.length < minimumCapacity){
            biggerArray = new int[minimumCapacity];
            System.arraycopy(data, 0, biggerArray, 0, manyItems);
            data = biggerArray;
        }
    }
    public int getCapacity(){
        return data.length;
    }
    public boolean remove(int target){
        int index; // The location of target in the data array
        // First, set index to the location of target in the data array,
        // which could be as small as 0 or as large as manyItems-1.
        // If target is not in the array, then index will be set equal to manyItems.
        index = 0;
        while ((index < manyItems) && (target != data[index])){
            index++;
        }
        if (index == manyItems){
            // The target was not found, so nothing is removed.
            return false;
        }
        else{ // The target was found at data[index].
            manyItems--;
            data[index] = data[manyItems];
            return true;
        }
    }
    public int size(){
        return manyItems;
    }
    public void trimToSize(){
        int[ ] trimmedArray;
        if (data.length != manyItems){
            trimmedArray = new int[manyItems];
            System.arraycopy(data, 0, trimmedArray, 0, manyItems);
            data = trimmedArray;
        }
    }
    public static IntArrayBag union(IntArrayBag b1, IntArrayBag b2){
        // If either b1 or b2 is null, then a NullPointerException is thrown.
        // In the case that the total number of items is beyond Integer.MAX_VALUE, there will
        // be an arithmetic overflow and the bag will fail.
        IntArrayBag answer = new IntArrayBag(b1.getCapacity( ) + b2.getCapacity( ));
        System.arraycopy(b1.data, 0, answer.data, 0, b1.manyItems);
        System.arraycopy(b2.data, 0, answer.data, b1.manyItems, b2.manyItems);
        answer.manyItems = b1.manyItems + b2.manyItems;
        return answer;
    }
    public boolean equals(IntArrayBag input){
        boolean equals = true;
        int compare;
        if (manyItems == input.size()){
            for(int i = 0; i < manyItems; i++){
                compare = data[i];
                if(countOccourances(compare) != input.countOccourances(compare)){
                    return false;
                }
            }
        }
        else{
            equals = false;
        }
        return equals;
    }
}
