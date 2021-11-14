package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPalindrome {
    // Implement your solution by completing the below function
    public String isPalindrome(String s) {
        String res = "true";

        int start = 0;
        int end = s.length()-1;

        while(start<end)
        {
            char startchar = charAtPosition(s.charAt(start));
            char endChar = charAtPosition(s.charAt(end));

            if(startchar=='0')
            {
                start++;
            }
            else if(endChar =='0')
            {
                end--;
            }
            else if(startchar!='0' && endChar =='0' &&  startchar!=endChar)
            {
                return "false";
            }
            else{
                start++;
                end--;
            }
        }
        return res;
    }


    public char charAtPosition(char c)
    {
        if(c>='a' && c<='z')
        {
            return c;
        }
        else if(c>='A' &&  c<='Z')
        {
            return (char)(c+32);
        }
        else{
            return '0';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        String result = new ValidPalindrome().isPalindrome(line);
        System.out.print(result);
    }
}
