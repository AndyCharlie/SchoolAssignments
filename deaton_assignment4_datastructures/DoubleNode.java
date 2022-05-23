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
public class DoubleNode {
    
    private double data;
    private DoubleNode link;
    private DoubleNode prevLink;
    
    public DoubleNode(double initialData, DoubleNode initialLink, DoubleNode initialPreviousLink){
      data = initialData;
      link = initialLink;
      prevLink = initialPreviousLink;
   }

   public void addNodeAfter(double item, DoubleNode prevlink){
       
      link = new DoubleNode(item, link, prevlink);
   }
   public double getData( ){
      return data;
   }
   public DoubleNode getLink( ){
      return link;                                               
   }
   public DoubleNode getPrevLink( ){
      return prevLink;                                               
   }
   public void removeNode( ){
      prevLink.link = link;
      link.prevLink = prevLink;
   }          
   public void setData(double newData)   {
      data = newData;
   }                                                               
   public void setLink(DoubleNode newLink){                    
      link = newLink;
   }
   public void setPrevLink(DoubleNode newLink){                    
      prevLink = newLink;
   }
}


