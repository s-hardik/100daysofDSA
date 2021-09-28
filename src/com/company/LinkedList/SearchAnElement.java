package com.company.LinkedList;

public class SearchAnElement {
    public  static boolean search(ListNode ll, int target)
    {
        ListNode temp = ll;
        boolean res   = false;
        if(temp == null)
        {
            return res;
        }
        else if(temp.data == target)
        {
            res = true;
        }
        else
        {
            while(temp != null)
            {
                if(temp.data == target)
                {
                    res  = true;
                    //return res;
                    break;
                }
                temp = temp.next;
            }
        }
        return res;
    }
}
