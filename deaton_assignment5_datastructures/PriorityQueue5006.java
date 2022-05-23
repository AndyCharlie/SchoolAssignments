/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment5_datastructures;

/**
 *
 * @author Adeat
 */


// because the GenericSequence class from the previous question acts exactly like a que (first in first out)
// im going to use that as the que implementation.
public class PriorityQueue5006 <E> {
    final int LOWEST_PRIORITY = 10;
    GenericSequence<E>[] priorityQue = new GenericSequence[LOWEST_PRIORITY];
    
    public void add(E items , int priority) throws Exception{
        if(priority <= LOWEST_PRIORITY){
            priorityQue[priority].add(items);
        }
        else{
            throw new Exception("priority lower than is allowed");
        }
    }
    public E remove(){
        E answer = null;
        for(int i = LOWEST_PRIORITY; i >= 0; i--) {
            if(!priorityQue[i].isEmpty()){
                answer = priorityQue[i].remove();
                break;
            }
        }
        return answer;
    }
}
