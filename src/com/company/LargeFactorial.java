package com.company;

import java.util.Scanner;

class LargeFactorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = largeFactorial(n);
        for (int j : ans)
            System.out.print(j);

    }


    static int[] largeFactorial(int n) {
        int[] arr = new int[10^200];
        int idx = 0;
        for(int i=1; i<=n;i++)// number to be multiplied
        {

            idx = multiply(arr, i, idx);
        }
        return reverseArr(arr, idx);
    }

    static int multiply(int[] arr, int i, int idx)
    {
        int carry = 0, num = 0;
        if(i == 1)
        {
            arr[0] = 1;
            return 0;

        }
        else
        {
            for(int j=0;j<=idx;j++)
            {
                num  = arr[j]*i + carry;
                arr[j] = num%10;
                carry = num/10;
            }

            while(carry!=0)
            {
                idx++;
                arr[idx] = carry%10;
                carry = carry/10;

            }
        }
        return idx;
    }

    static int[] reverseArr(int[] arr, int idx)
    {
        int[] res = new int[idx+1];
        for(int k=0; k<=idx;k++)
        {
            res[k] = arr[idx-k];
        }
        return res;
    }


}
