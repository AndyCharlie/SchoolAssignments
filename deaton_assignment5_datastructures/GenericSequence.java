/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment5_datastructures;

/**
 *
 * @author Adeat
 * @param <E>
 */
public class GenericSequence<E> implements Cloneable{
    Object[] data;
    int manyitems;
    int front;
    int end;
    
    public GenericSequence(){
        data = new Object[10];
        manyitems = 0;
        front = 0;
        end = 0;
    }
    
    public GenericSequence (int size){
        data = new Object[size];
        manyitems = 0;
        front = 0;
        end = 0;
    }
    
    public void add(E element){
        if((end) >= data.length){
            ensureCapacity((manyitems * 2) + 1);
        }
        data[end] = element;
        manyitems++;
        end++;
    }
    
    public void addAll(GenericSequence<E> addend){
        if((end + addend.manyitems) >= data.length){
            ensureCapacity(manyitems + addend.manyitems);
        }
        System.arraycopy(addend.data, addend.front, data, end, addend.manyitems);
        end = end + addend.manyitems;
        manyitems = manyitems + addend.manyitems;
    }
    
    public E remove(){
        E output;
        output = (E) data[front];
        front++;
        manyitems--;
        return output;
        
    }
    
    @Override
    public GenericSequence<E> clone() throws CloneNotSupportedException{
        GenericSequence<E> answer;
            try{
                answer = (GenericSequence<E>) super.clone();
            }
            catch(CloneNotSupportedException X){
                throw new RuntimeException("...");
            }
            answer.data= data.clone();
            return answer;
    }
    
    public int countOccurences(E target){
        int answer = 0, index;
            if(target == null) {
                for(index = front; index < manyitems; index++){
                    if(data[index] == null){
                        answer++;
                    }
                }
            } 
            else {
                for(index = front; index < manyitems; index++){
                    if(target.equals(data[index])){
                        answer++;
                    }
                }    
            }
        return answer;
    }
    
    public void ensureCapacity(int minimumCapacity){
        Object[] biggerArray;
        if (data.length < minimumCapacity){
            biggerArray = new Object[minimumCapacity];
            System.arraycopy(data, front, biggerArray, 0, manyitems);
            data = biggerArray;
            front = 0;
            end = manyitems;
        }
    }

    public int getCapacity(){
        return data.length;
    }
    public boolean isEmpty(){
        if(manyitems == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void trimToSize(){
        Object[] trimmedArray;
        trimmedArray = new Object[manyitems];
        System.arraycopy(data, front, trimmedArray, 0, manyitems);
        data = trimmedArray;
    }
    
    public static <E> GenericSequence<E> union(GenericSequence<E> s1, GenericSequence<E> s2) throws CloneNotSupportedException{
        GenericSequence<E> answer = new GenericSequence<E>(s1.getCapacity() + s2.getCapacity());
        System.arraycopy(s1.data, s1.front, answer.data, 0, s1.manyitems);
        System.arraycopy(s2.data, s2.front, answer.data, s1.manyitems, s2.manyitems);
        return answer;
        
    }
    
}
