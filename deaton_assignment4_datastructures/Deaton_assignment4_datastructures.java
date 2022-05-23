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
public class Deaton_assignment4_datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        LinkedInteger test = new LinkedInteger(333);
//        LinkedInteger test2 = new LinkedInteger(999);
//        LinkedInteger answer;
//        answer = test.subtractLinkedInteger(test2);
//        System.out.println(answer.getInteger());

        DoubleNode doubletest = new DoubleNode(3.0,null,null);
        DoubleNode head = doubletest;
        doubletest.addNodeAfter(1.1, doubletest);
     
        doubletest= doubletest.getLink();
        doubletest.addNodeAfter(2.2, doubletest);
  
        doubletest= doubletest.getLink();
        doubletest.addNodeAfter(3.3, doubletest);
   
        doubletest= doubletest.getLink();
        doubletest.addNodeAfter(4.4, doubletest);
  
        doubletest= doubletest.getLink();
        doubletest.addNodeAfter(5.5, doubletest);
 
        doubletest= doubletest.getLink();
        doubletest.addNodeAfter(6.6, doubletest);
        head = head.getLink();
        while(head.getPrevLink() != null){
            System.out.println(head.getData());
            System.out.println(head.getPrevLink().getData());
            head= head.getLink();
        }
  //      cursor = cursor.head;
//       while(cursor != null){
//            System.out.println(cursor.getData());
//            cursor= cursor.getLink();
//        }
    }
    
}
