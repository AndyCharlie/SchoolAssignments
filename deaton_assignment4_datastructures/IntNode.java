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
public class IntNode {
    // Invariant of the IntNode class:
   //   1. The node's integer data is in the instance variable data.
   //   2. For the final node of a list, the link part is null.
   //      Otherwise, the link part is a reference to the
   //      next node of the list.
   private int data;
   private IntNode link;
   public IntNode(int initialData, IntNode initialLink){
      data = initialData;
      link = initialLink;
   }

   public void addNodeAfter(int item){
      link = new IntNode(item, link);
   }
   public int getData( ){
      return data;
   }
   public IntNode getLink( ){
      return link;                                               
   } 
   public static IntNode listCopy(IntNode source){
      IntNode copyHead;
      IntNode copyTail;
      if (source == null)
         return null;
      copyHead = new IntNode(source.data, null);
      copyTail = copyHead;
      while (source.link != null)
      {
         source = source.link;
         copyTail.addNodeAfter(source.data);
         copyTail = copyTail.link;
      }
      return copyHead;
   }
   public static IntNode[ ] listCopyWithTail(IntNode source){
      IntNode copyHead;
      IntNode copyTail;
      IntNode[ ] answer = new IntNode[2];
     
      // Handle the special case of the empty list.   
      if (source == null)
         return answer; // The answer has two null references .
      
      // Make the first node for the newly created list.
      copyHead = new IntNode(source.data, null);
      copyTail = copyHead;
      
      // Make the rest of the nodes for the newly created list.
      while (source.link != null)
      {
         source = source.link;
         copyTail.addNodeAfter(source.data);
         copyTail = copyTail.link;
      }
      
      // Return the head and tail references.
      answer[0] = copyHead;
      answer[1] = copyTail;
      return answer;
   } 
   public static int listLength(IntNode head){
      IntNode cursor;
      int answer;
      
      answer = 0;
      for (cursor = head; cursor != null; cursor = cursor.link)
         answer++;
        
      return answer;
   }
   public static IntNode[ ] listPart(IntNode start, IntNode end){
      IntNode copyHead;
      IntNode copyTail;
      IntNode cursor;
      IntNode[ ] answer = new IntNode[2];
      
      // Make the first node for the newly created list. Notice that this will
      // cause a NullPointerException if start is null.
      copyHead = new IntNode(start.data, null);
      copyTail = copyHead;
      cursor = start;
      
      // Make the rest of the nodes for the newly created list.
      while (cursor != end)
      {
         cursor = cursor.link;
         if (cursor == null)
            throw new IllegalArgumentException
            ("end node was not found on the list");
         copyTail.addNodeAfter(cursor.data);
         copyTail = copyTail.link;
      }
      
      // Return the head and tail references
      answer[0] = copyHead;
      answer[1] = copyTail;
      return answer;
   }        
   public static IntNode listPosition(IntNode head, int position){
      IntNode cursor;
      int i;
      
      if (position <= 0)
           throw new IllegalArgumentException("position is not positive");
      
      cursor = head;
      for (i = 1; (i < position) && (cursor != null); i++)
         cursor = cursor.link;

      return cursor;
   } 
   public static IntNode listSearch(IntNode head, int target){
      IntNode cursor;
      
      for (cursor = head; cursor != null; cursor = cursor.link)
         if (target == cursor.data)
            return cursor;
        
      return null;
   }
   public void removeNodeAfter( ){
      link = link.link;
   }          
   public void setData(int newData)   {
      data = newData;
   }                                                               
   public void setLink(IntNode newLink){                    
      link = newLink;
   }
}
