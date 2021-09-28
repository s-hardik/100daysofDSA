package com.company.LinkedList;

public class Display {
    public static void display(ListNode ll) {
        ListNode temp = ll;
        while(temp != null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
