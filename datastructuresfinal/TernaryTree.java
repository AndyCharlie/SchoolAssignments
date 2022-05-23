/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresfinal;

/**
 *
 * @author Adeat
 */
public class TernaryTree {
    int data;
    TernaryTree child1;
    TernaryTree child2;
    TernaryTree child3;
        
    public TernaryTree(int data, TernaryTree link1, TernaryTree link2, TernaryTree link3){
        this.data = data;
         child1 = link1;
         child2 = link2;
         child3 = link3;
        }
        
        public int getData(){
            return data;
        }
    
    public static void childrenFirstPrint(TernaryTree t){
        TernaryTree pointer = t;
        if(pointer == null){
            return;
        }
        if(pointer.child1 != null){
            childrenFirstPrint(pointer.child1);
        }
        if(pointer.child2 != null){
            childrenFirstPrint(pointer.child2);
        }
        if(pointer.child3 != null){
            childrenFirstPrint(pointer.child3);
        }
        if(pointer != null){
            System.out.println(pointer.getData());
        } 
    }
}
    
    
    
    
    
    
//    private class intNode{
//        int data;
//        intNode child1;
//        intNode child2;
//        intNode child3;
//        
//        public intNode(int data, intNode link1, intNode link2, intNode link3){
//            this.data = data;
//            child1 = link1;
//            child2 = link2;
//            child3 = link3;
//        }
//        
//        public int getData(){
//            return data;
//        }
//        
//    } 
}

