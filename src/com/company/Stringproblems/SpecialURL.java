package com.company.Stringproblems;

import java.util.Scanner;

public class SpecialURL {

    public static String change(String s) {
        //return s.replaceAll(" ", "%20");

        char[] stringChar = s.toCharArray();
        String modified = "";
        for(int i=0;i<stringChar.length;i++)
        {
            if(stringChar[i]==' ')
            {
                modified  += "%20";
            }
            else
            {
                modified +=stringChar[i];
            }
        }
        //String replacedString = new String(stringChar);
        return modified;


    }
    public static void main(String args[]) throws Exception {

        Scanner sc  = new Scanner(System.in);

        String s = new String();
        String ans = new String();
        s = sc.nextLine();
        ans = change(s);
        System.out.print(ans);

    }
}
