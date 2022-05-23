/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_assignment4_datastructures;

import deaton_assignment4_datastructures.IntNode;
import java.lang.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Adeat
 */
public class LinkedInteger {

    private IntNode head = null;
    private int manyNodes = 0;

    public LinkedInteger(int... elements) {
        for (int i = 0; i < elements.length; i++) {    // to store it in a manner in so that accessing it in order would be same as in constructor for LinkedInteger: (int i = elements.length - 1; i >= 0; i--) however leaving it in reverse order to add/subtract easier.
            if (elements[i] > 999 || elements[i] < 0) {
                throw new IllegalArgumentException("given values over 999 or are nevative");
            } else {
                head = new IntNode(elements[i], head);
                manyNodes++;
            }
        }
    }

    private LinkedInteger(IntNode head) {
        this.head = head;
        manyNodes = IntNode.listLength(head);
    }

    private IntNode getIntNode() {
        return head;
    }

    private static int getLarger(LinkedInteger one, LinkedInteger two) {
        int result;
        if (one.manyNodes > two.manyNodes) {
            result = one.manyNodes;
        } else {
            result = two.manyNodes;
        }
        return result;
    }

    public String getInteger() {
        IntNode cursor;
        StringBuilder stringBuilder = new StringBuilder();
        for (cursor = head; cursor != null; cursor = cursor.getLink()) {
            stringBuilder.insert(0, String.format("%0" + 3 + "d", cursor.getData()));
            //stringBuilder.append(String.format( "%0" + 3 + "d"  ,cursor.getData()));  to display in the actual order they appear in the linked list.
        }
        String out = stringBuilder.toString();
        return out;
    }

    public LinkedInteger addLinkedInteger(LinkedInteger addend) {
        IntNode cursor1 = head;
        IntNode cursor2 = addend.getIntNode();
        IntNode result = null;
        Stack<Integer> tempStack = new Stack<>();          //using a stack to preserve the order in which i input the values into the linked list.
        int carry = 0, temp1, temp2, total;
        int traverse = getLarger(this, addend);
        for (int i = 0; i <= traverse; i++) {
            if (cursor1 != null) {
                temp1 = cursor1.getData();
            } else {
                temp1 = 0;
            }
            if (cursor2 != null) {
                temp2 = cursor2.getData();
            } else {
                temp2 = 0;
            }
            total = temp1 + temp2 + carry;
            carry = (total / 1000);
            total = (total % 1000);
            if ((cursor1 != null) || (cursor2 != null)) {
                tempStack.push(total);
            }
            if (cursor1 != null) {
                cursor1 = cursor1.getLink();
            }
            if (cursor2 != null) {
                cursor2 = cursor2.getLink();
            }
            if ((cursor1 == null) && (cursor2 == null) && (carry > 0)) {
                if (carry != 0) {
                    tempStack.push(total);
                }
            }
        }
        while (!tempStack.isEmpty()) {
            result = new IntNode(tempStack.pop(), result);
        }
        LinkedInteger answer = new LinkedInteger(result);
        return answer;
    }

    public LinkedInteger subtractLinkedInteger(LinkedInteger subtractor) throws Exception {
        if(manyNodes < subtractor.manyNodes){
            throw new Exception("Linked Integer Can Not Be Negative");
        }
        IntNode cursor1 = head;
        IntNode cursor2 = subtractor.getIntNode();
        IntNode result = null;
        Stack<Integer> tempStack = new Stack<>();          //using a stack to preserve the order in which i input the values into the linked list.
        int carry = 0, temp1, temp2, total;
        int traverse = getLarger(this, subtractor);
        for (int i = 0; i <= traverse; i++) {
            if (cursor1 != null) {
                temp1 = cursor1.getData();
            } else {
                temp1 = 0;
            }
            if (cursor2 != null) {
                temp2 = cursor2.getData();
            } else {
                temp2 = 0;
            }
            if ((temp1 - temp2 - carry) < 0) {
                temp1 = temp1 * 10;
                total = temp1 - temp2 - carry;
                carry = 1;
            } else {
                total = temp1 - temp2 - carry;
                carry = 0;
            }
            if(total < 0){
                throw new Exception("Linked Integer Can Not Be Negative");
            }
            total = (total % 1000);
            if ((cursor1 != null) || (cursor2 != null)) {
                tempStack.push(total);
            }
            if (cursor1 != null) {
                cursor1 = cursor1.getLink();
            }
            if (cursor2 != null) {
                cursor2 = cursor2.getLink();
            }
            if ((cursor1 == null) && (cursor2 == null) && (carry > 0)) {
                if (carry != 0) {
                    tempStack.push(total);
                }
            }
        }
        while (!tempStack.isEmpty()) {
            result = new IntNode(tempStack.pop(), result);
        }
        LinkedInteger answer = new LinkedInteger(result);
        return answer;
    }

}
