package com.company.LinkedList;
import com.company.LinkedList.ListNode;

import java.util.Scanner;

public class DeleteFromLL {

    public static ListNode deleteAtMiddle(ListNode ll, int target) {
        ListNode temp = ll;
        if(ll == null)
        {
            return ll;
        }
        else if(temp.data == target)
        {
            ll = temp.next;
        }
        else {
            while (temp.next.data != target) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return ll;
    }

    public static ListNode deleteAtEnd(ListNode ll) {
        ListNode temp = ll;
        if(temp == null)
        {
            return ll;
        }
        else if(temp.next == null)
        {
            ll = null;
        }
        else
        {
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        return ll;
    }

    public static ListNode deleteAtBegining(ListNode ll) {
        ListNode temp = ll;
        if(ll ==  null)
        {
            return ll;
        }
        else if(temp.next == null)
        {
            ll = null;
        }
        else
        {
            ll = temp.next;
        }
    return ll;
    }


    }


