package com.company.Stringproblems;

import java.util.Scanner;

class Capitalise {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    // Method to convert each character of a word into capital.
    static String capitalise(String str) {
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            // System.out.println(arr[i]);
            if((i == 0 && arr[i]!=' ') || (arr[i-1]==' '&&arr[i]!=' '))
            {
                if(arr[i]>=97 && arr[i]<=122)
                {
                    arr[i] = (char)(arr[i]-32);
                }
            }
        }
        String finalString = new String(arr);
        return finalString;
    }
}
