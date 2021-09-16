package com.company.Matrix;

import java.util.Scanner;

public class SumofPrincipleDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
    }
    // TODO: Implement this method
    static int diagonalSum(int n, int[][] a) {
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum +=a[i][i];//Time complexity is O(n).
        }
        return sum;
    }
}
