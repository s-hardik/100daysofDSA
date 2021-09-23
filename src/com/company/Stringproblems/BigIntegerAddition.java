package com.company.Stringproblems;

import java.util.Scanner;

class BigIntegerAddition {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    static int digitAt(String num, int positionFromLsb)
    {
        if(positionFromLsb>num.length()-1)
        {
            return 0;
        }
        else{
            return num.charAt(num.length()-1-positionFromLsb)-'0';
        }
    }

    static void builddigits(StringBuilder reverseSum, int digit)
    {
        reverseSum.append(digit);
    }


    static String bigIntegerAddition(String num1, String num2) {

        StringBuilder reverseSum = new StringBuilder();
        int carry = 0;
        for(int i = 0;i<num1.length() || i<num2.length();i++)
        {
            int num = digitAt(num1, i)+ digitAt(num2, i)+carry;
            builddigits(reverseSum, num%10 );
            carry = num/10;
        }

        if(carry!=0)
        {
            builddigits(reverseSum, carry);
        }


        return reverseSum.reverse().toString();
    }
}
