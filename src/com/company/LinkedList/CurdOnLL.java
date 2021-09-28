package com.company.LinkedList;

import java.util.Scanner;

public class CurdOnLL {
    public static void main(String[] args) {
        ListNode ll = null;
        Scanner scan  = new Scanner(System.in);
        int target = 0;
        while(true) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            switch (n) {
                case 1:
                    ll = InsertingIntoLL.insertAtBegining(ll, x);
                    break;
                case 2:
                    ll = InsertingIntoLL.insertAtEnd(ll, x);
                    break;
                case 3:
                    target = scan.nextInt();
                    ll = InsertingIntoLL.insertAtMiddle(ll, x, target);
                    break;
                case 4:
                    ll = DeleteFromLL.deleteAtBegining(ll);
                    break;
                case 6:
                    ll = DeleteFromLL.deleteAtEnd(ll);
                    break;
                case 7:
                    target = scan.nextInt();
                    ll = DeleteFromLL.deleteAtMiddle(ll, target);
                    break;
            }
            Display.display(ll);
        }
    }
    }

