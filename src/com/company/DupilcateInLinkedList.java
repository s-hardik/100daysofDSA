package com.company;

import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class DuplicateInLinkedList
{

    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node start = head;
        if(head==null)
        {
            return head;
        }
        else
        {
            Node ptr1=null, ptr2=null;
            ptr1 = head;

            while(ptr1!=null)
            {
                ptr2 = ptr1;
                while(ptr2.next!=null)
                {
                    if(ptr1.data==ptr2.next.data)
                    {
                        ptr2.next = ptr2.next.next;
                    }
                    else
                    {
                        ptr2 = ptr2.next;
                    }
                }
                ptr1 = ptr1.next;
            }
            return start;
        }
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}