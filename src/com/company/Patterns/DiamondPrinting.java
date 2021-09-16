package com.company.Patterns;

import java.util.Scanner;

class DiamondPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] diamondPrinting(int n) {
        String[] arr = new String[2*n-1];
        String curr  = "";
        int space = n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=space ;j>=1;j--)
            {
                curr += " ";
            }
            for(int j=0;j<=i;j++)
            {
                curr +="* ";
            }
            space--;

            arr[i] = curr;
            curr = "";

        }
        //int d =
        for(int k = n, j=1;k<2*n-1;k++)
        {
            arr[k] = arr[n-1-j];
            j++;
        }

        return arr;
    }
}
