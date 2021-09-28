package com.company;

import java.util.Scanner;

import java.io.*;
public class ModularExponentiation
{

    /* Iterative Function to calculate (x^y) in O(log y) */
    static int power(int x, int y, int p)
    {
        int res = 1; // Initialize result

        x = x % p; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {

            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int x = 100000000;
        int y = 2;
        int p = 1000000007;
        System.out.print("Power is " + power(x, y, p));
    }
}