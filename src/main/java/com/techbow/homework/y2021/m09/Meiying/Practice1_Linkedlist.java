package com.techbow.homework.y2021.m09.Meiying;

import java.util.LinkedList;

public class Practice1_Linkedlist {
    //initialization of ListNode
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head){
        //setup dummy variable
        Node dummy = new Node(-1);
        //point to the head
        Node cur = head;
        while (cur != null) {
            //dummy to cur to dummy.next
            //先记录cur.NEXT
            Node next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = next;
        }
        return dummy.next;


    }
}




