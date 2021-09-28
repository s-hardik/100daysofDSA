package com.company.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
class ListNode{
    public int data;
    public ListNode next;
    ListNode(int x)
    {
        data = x;
        next = null;
    }
}
public class InsertingIntoLL {
    public static void main(String[] args) {

        ListNode ll = null;
        Scanner scan  = new Scanner(System.in);

        while(true) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            switch (n) {
                case 1:
                    ll = insertAtBegining(ll, x);
                    break;
                case 2:
                    ll = insertAtEnd(ll, x);
                    break;
                case 3:
                    int target = scan.nextInt();
                    ll = insertAtMiddle(ll, x, target);
                    break;
            }
            display(ll);
        }
        }

    private static void display(ListNode ll) {
        ListNode temp = ll;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static ListNode insertAtMiddle(ListNode ll, int x, int target) {
        ListNode temp = ll;
        while(temp.data != target)
        {
            temp = temp.next;
        }
        ListNode nl = new ListNode(x);
        nl.next = temp.next;
        temp.next = nl;
        return ll;
    }

    private static ListNode insertAtBegining(ListNode ll, int x) {
        if(ll == null)
        {
            ll = new ListNode(x);
        }
        else
        {
            ListNode temp = new ListNode(x);
            temp.next = ll;
            ll = temp;
        }
        return ll;
    }

    private static ListNode insertAtEnd(ListNode ll, int x) {
        ListNode temp = ll;
        if(temp == null)
        {
            ll = new ListNode(x);
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new ListNode(x);
        }

        return ll;
    }


}



