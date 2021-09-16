package com.company.Matrix;

import java.util.Scanner;

public class PrintAllDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        printAllDiagonalValues(n, a);
        //System.out.println(result);
    }
//pending
    private static void printAllDiagonalValues(int n, int[][] a) {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i][i]);
        }
    }
}
