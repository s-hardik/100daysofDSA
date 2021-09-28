package com.company.LinkedList;
import com.company.LinkedList.ListNode;

import java.util.Scanner;

public class InsertingIntoLL {

    public static ListNode insertAtMiddle(ListNode ll, int x, int target) {
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

    public static ListNode insertAtBegining(ListNode ll, int x) {
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

    public static ListNode insertAtEnd(ListNode ll, int x) {
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



