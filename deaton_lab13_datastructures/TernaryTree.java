/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab13_datastructures;

/**
 *
 * @author Adeat
 */
public class TernaryTree {
    private Node root;
    
    
    public void setRightNode(Node inputNode, int value){
        if(root == null){
            root = new Node(value);
        }
        else{
        inputNode.rightChild = new Node(value);
        }
    }
    
    public Node getRightChild(Node rootNode){
        if(rootNode.rightChild == null){
            return null;
        }
        else{
            return rootNode.rightChild;
        }
    }
    public Node getMiddleChild(Node rootNode){
        if(rootNode.centerChild == null){
            return null;
        }
        else{
            return rootNode.centerChild;
        }
    }
    public Node getLeftChild(Node rootNode){
        if(rootNode.leftChild == null){
            return null;
        }
        else{
            return rootNode.leftChild;
        }
    }
    
    public void setMiddleChild(Node inputNode, int value){
        if(root == null){
            root = new Node(value);
        }
        else{
        inputNode.centerChild = new Node(value);
        }
    }
    
    public void setLeftChild(Node inputNode, int value){
        if(root == null){
            root = new Node(value);
        }
        else{
        inputNode.leftChild = new Node(value);
        }
    }
    
    public TernaryTree(int rootValue){
        
        root = new Node(rootValue);
        
    }
    

private class Node {
		int data;
		Node leftChild;
		Node rightChild;
		Node centerChild;
                
		public Node(int dataValue) {
			data = dataValue;
			leftChild = null;
			rightChild = null;
			centerChild = null;
		}
	}
}