/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab8_datastructures;

/**
 *
 * @author Adeat
 */
public class IntNode {
    private int data;
    private IntNode link;
 
    public IntNode(int initialData, IntNode initialLink){
        data = initialData;
        link = initialLink;
    }
    public int getData(){
        return data;
    }
    public void setData(int newData){
        data = newData;
    }
    public IntNode getLink(){
        return link;
    }
    public void setLink(IntNode newLink){
        link = newLink;
    }
    public void addNodeAfter(int element){
        link = new IntNode(element, link);
    }
    public static void sortList(IntNode head){
        int temp;
        IntNode current = head;
        IntNode cursor = null;
        if (head == null){
            return;
        }
        else{
            while(current != null){
                cursor = current.link;
                while(cursor != null){
                    if(current.data > cursor.data){
                        temp = current.data;
                        current.data = cursor.data;
                        cursor.data = temp;
                    }
                    cursor = cursor.link;
                }
                current = current.link;
            }
        }
    }
    public static IntNode addLists(IntNode a, IntNode b){
        IntNode output;
        output = a;
        IntNode cursor = output;
        while(cursor != null){
            cursor = cursor.link;
        }
        cursor.link = b;
        sortList(output);
        return output;
    }
    public static IntNode[] spilitList(IntNode head, int split){
        IntNode[] answer = new IntNode[2];
        IntNode current = head;
        IntNode answer1cursor = null;
        IntNode answer2cursor = null;
        IntNode answer1 = answer1cursor;
        IntNode answer2 = answer2cursor;
        
        if (head == null){
            throw new IllegalArgumentException();
        }
        else{
            while(current != null){
                
                if(current.data > split){
                    if(answer1 == null){
                        answer1 = current;
                        answer1cursor = answer1.link;
                    }
                    else{
                        answer1cursor.link = current;
                        
                    }
                }
                else{
                    if(answer2 == null){
                        answer2 = current;
                        answer2cursor = answer2.link;
                    }
                    answer2cursor.link = current;
                }
            }
        }
        answer[1] = answer1;
        answer[0] = answer2;
        return answer;
    }    
}
