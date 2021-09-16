package com.company.Matrix;

import java.util.Scanner;

public class SumOfSecondaryDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = secondaryDiagonalSum(n, a);
        System.out.println(result);
    }

    private static int secondaryDiagonalSum(int n, int[][] a) {
        int sum = 0;
        //using two for lops meand iterating over complete matrix
        //Also time complexity is O(n^2)
//        for(int i=0;i<n;i++)
//        {
//            for(int j=n-1;j>=0;j--)
//            {
//                if(i+j==n-1)
//                {
//                    sum += a[i][j];
//                }
//            }
//        }

        for(int i=0;i<n;i++)
        {
            sum +=a[i][n-1-i];//Time complexity is reduced to O(n)
            //Relation between i, j and n is useful here
            // i+j = n-1 --->using two variables here
            //i = n-1-j--->reduced to single variable.
        }
        return sum;
    }
}
