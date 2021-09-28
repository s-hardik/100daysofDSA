package com.company.LinkedList;

import java.util.Scanner;

public class CurdOnLL {
    public static void main(String[] args) {
        ListNode ll = null;
        Scanner scan  = new Scanner(System.in);
        int target = 0;
        while(true) {
            int n = scan.nextInt();
            int x = 0;
            switch (n) {
                case 1:
                    x = scan.nextInt();
                    ll = InsertingIntoLL.insertAtBegining(ll, x);
                    break;
                case 2:
                    x = scan.nextInt();
                    ll = InsertingIntoLL.insertAtEnd(ll, x);
                    break;
                case 3:
                    target = scan.nextInt();
                    ll = InsertingIntoLL.insertAtMiddle(ll, x, target);
                    break;
                case 4:
                    ll = DeleteFromLL.deleteAtBegining(ll);
                    break;
                case 5:
                    ll = DeleteFromLL.deleteAtEnd(ll);
                    break;
                case 6:
                    target = scan.nextInt();
                    ll = DeleteFromLL.deleteAtMiddle(ll, target);
                    break;
                case 7:
                    target = scan.nextInt();
                    System.out.println(SearchAnElement.search(ll,target));
                    break;
            }
            Display.display(ll);
        }
    }
    }

