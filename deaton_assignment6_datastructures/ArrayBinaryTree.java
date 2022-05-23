/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment6_datastructures;
import java.lang.Math;
/**
 *
 * @author Adeat
 * @param <E>
 */
public class ArrayBinaryTree <E> {
    private int treedepth = 3;
    private Object[] tree;
    int manyitems;
    int parrent = 0;
    int cursor = 0;
    private boolean[] isPresent;
    
    public ArrayBinaryTree(){
        tree = new Object[(int)(Math.pow(2 , (treedepth + 1)) - 1)]; //creatind default tree with eenough nodes for a tree with depth 3
        isPresent = new boolean[(int)(Math.pow(2 , (treedepth + 1)) - 1)];
        manyitems = 0;
        cursor = 0;
        
    }
    public void createRoot(E input){
        tree[0] = input;
        manyitems++;
        isPresent[0] = true;
    }
    public void moveCursorToRightChild(){
        if (((2*cursor) +2) > tree.length){
            throw new RuntimeException("Cannot move cursor, pointing out of range");
        }
        else{
            cursor = (2*cursor) +2;
        }
    }
    public void moveCursorToLeftChild(){
        if (((2*cursor) +1) > tree.length){
            throw new RuntimeException("Cannot move cursor, pointing out of range");
        }
        else{
            cursor = (2*cursor) +1;
        }
    }
    public void moveCursorToParrent(){
        cursor = (cursor - 1) / 2;
    }
    public void setCursorToRoot(){
        cursor = 0;
    }
    public void addRightNodeToCursor(E input){
        if (((2*cursor) +2) > tree.length){
            throw new RuntimeException("Cannot add, pointing out of range");
        }
        else{
        tree[(2*cursor) +2] = input;
        isPresent[(2*cursor) +2] = true;
        manyitems++;
        }
    }
    
    public void addLeftNodeToCursor(E input) throws Exception{
        if ((((2*cursor) +1) > tree.length)){
            throw new RuntimeException("Cannot add, pointing out of range");
        }
        else{
        tree[(2*cursor) +1] = input;
        isPresent[(2*cursor) +1] = true;
        manyitems++;
        }
    }
    
    
    
}
