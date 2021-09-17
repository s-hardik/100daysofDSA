package com.company;

import java.util.Scanner;

class CoprimeNumbers {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = coprimeNumbers(n);

        System.out.println(result);

    }

    static int coprimeNumbers(int n) {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(getGcd(i,n)==1)
            {
                count++;
            }
        }
        return count;
    }

    static int getGcd(int i, int n)
    {
        int maxGcd = 0;
        int minValue = getMin(i,n);
        for(int j=1;j<=minValue;j++)
        {
            if(i%j==0 && n%j==0)
            {
                maxGcd = j;
            }
        }
        return maxGcd;
    }

    static int getMin(int i, int n)
    {
        if(i<n)
        {
            return i;
        }
        else
        {
            return n;
        }
    }
}
