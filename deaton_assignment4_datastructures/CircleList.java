/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment4_datastructures;

/**
 *
 * @author Adeat
 */
public class CircleList {
    public class Node{  
        int data;  
        Node next;  
        Node prev;
        public Node(int data) {  
            this.data = data;  
        }  
    }   
    public Node head = null;  
    public Node tail = null;  
   
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {   
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
            newNode.prev = head;
        }  
        else {  
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;    
            tail.next = head;  
        }  
    }  
}
