/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresfinal;

/**
 *
 * @author Adeat
 * @param <S>
 * @param <T>
 */
public class genericPair<S,T> {
    Object first;
    Object second;
    
    public genericPair(S first, T second){
        this.first = first;
        this.second = second;
    }
    public S first(){
        return (S)(first);
    }
    public T second(){
        return (T)(second);
    }
    
}

