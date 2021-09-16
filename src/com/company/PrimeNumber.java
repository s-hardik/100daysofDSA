package com.company;

import java.io.*;
import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan  = new Scanner(System.in);
        int t = scan.nextInt();
        while(scan.hasNext())
        {
            int flag = 0;
            int n = scan.nextInt();
            if(n==1)
            {
                System.out.println("Not prime");
            }
            else if(n==2)
            {
                System.out.println("Prime");
            }
            else
            {


                for(int i=2;i<=Math.sqrt(n);i++)
                {
                    if(n%i==0)
                    {
                        flag = 1;
                    }
                }
                if(flag==0)
                {
                    System.out.println("Prime");
                }
                else
                {
                    System.out.println("Not prime");
                }
            }
        }
    }
}
