package com.company.Stringproblems;

import java.util.Scanner;

public class ToggleCase {

    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr =  Toggle(str);
        System.out.println(captStr);
    }

    private static String Toggle(String str) {
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=' ' && arr[i]!='.')
            {
                if(arr[i]>=65 && arr[i]<=91)
                {
                    arr[i] = (char)(arr[i]+32);
                }
                else
                {
                    arr[i] = (char)(arr[i]-32);
                }
            }
        }
        String s = new String(arr);
        return s;
    }
}
