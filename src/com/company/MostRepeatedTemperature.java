package com.company;


import java.util.Scanner;

class MostRepeatedTemperature {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = mostRepeatedTemperature(n, a);
        System.out.println(ans);
    }


    static int mostRepeatedTemperature(int n, int a[]) {

        int maxTimes1 = 0,maxTimes2 = 0;
        int res = -30;
        for(int i=0;i<n;i++)
        {
            int tempres = a[i];
            maxTimes1=0;
            for(int j=0;j<n;j++)
            {
                if(tempres==a[j])
                {
                    maxTimes1++;
                }
            }
            if(maxTimes1 == maxTimes2)
            {
                if(a[i]>res)
                {
                    res = a[i];
                }
            }
            else if(maxTimes1 > maxTimes2)
            {
                maxTimes2 = maxTimes1;
                res = a[i];
            }

        }
        return res;
    }
}
