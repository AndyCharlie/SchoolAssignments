/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment6_datastructures;

/**
 *
 * @author Adeat
 */
class stringBSTNode{
    private String data;
    private stringBSTNode left;
    private stringBSTNode right;
    
    public stringBSTNode(String data, stringBSTNode right , stringBSTNode left){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public String getData(){
        return data;
    }
    public void setData(String input){
        data = input;
    }
    public stringBSTNode getLeft(){
        return left;
    }
    public stringBSTNode getRight(){
        return right;
    }
    public void setRight(stringBSTNode input){
            right = input;
    }
    public void setLeft(stringBSTNode input){
            left = input;
    }
    public String getRightmostData(){
        String output = "";
        stringBSTNode cursor = this;
        if(cursor.getRight() == null){
            output = cursor.getData();
        }
        else{
            while(cursor.getRight() != null){
                output = cursor.getRight().getData();
                cursor = cursor.getRight();
            }
        }
        return output;
        
    }
    public stringBSTNode removeRightMost(){
        stringBSTNode parent = this;
        stringBSTNode cursor = parent.getRight();
        if(cursor == null){
        return null;
        }
        while(cursor.getRight() != null){
            cursor = cursor.getRight();
            parent = parent.getRight();
        }
        parent.setRight(cursor.getLeft().removeRightMost());
        return cursor;
    }
}

public class BinaryStringSearchTree {
    stringBSTNode root;
    
    public BinaryStringSearchTree(String rootString){
        root = new stringBSTNode(rootString, null, null);
    }
    public BinaryStringSearchTree(){
        root = null;
    }
    public void add(String element){
        if(root == null){
            root = new stringBSTNode(element, null, null);
            return;
        }
        stringBSTNode cursor = root;
        boolean done = false;
        while(!done){
            if(cursor.getData().compareTo(element) <= 0){
                if(cursor.getLeft() == null){
                    cursor.setLeft(new stringBSTNode(element, null, null));
                    done = true;
                }
                else{
                    cursor = cursor.getLeft();
                }
            }
            if(cursor.getData().compareTo(element) > 0){
                if(cursor.getRight() == null){
                    cursor.setRight(new stringBSTNode(element, null, null));
                    done = true;
                }
                else{
                    cursor = cursor.getRight();
                }
            }
        }
    }
    
    public boolean remove(String target){
        stringBSTNode cursor = root;
        stringBSTNode parent = null;
        boolean found = false;
        while(!found && cursor != null){
            if(target.equals(cursor.getData())){
                found = true;
            }
            else if(cursor.getData().compareTo(target) <= 0){
                parent = cursor;
                cursor = cursor.getLeft();
            }
            else if(cursor.getData().compareTo(target) > 0){
                parent = cursor;
                cursor = cursor.getRight();
            }
        }
        if(cursor == null){
            return false;
        }
        if(cursor.getLeft() == null){
            if(cursor == root){
                root = root.getRight();
            }
            else if(cursor == parent.getLeft()){
                parent.setLeft(cursor.getRight());
            }
            else{
                parent.setRight(cursor.getRight());
            }
            return true;
        }
        else{
            cursor.setData(cursor.getLeft().getRightmostData());
            cursor.setLeft(cursor.getLeft().removeRightMost());
            return true;
            }
    }
    
    
}
