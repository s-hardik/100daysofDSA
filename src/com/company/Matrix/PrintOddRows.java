package com.company.Matrix;

import java.util.Scanner;

public class PrintOddRows {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int grid[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = printEvenColumns(n,m, grid);

        System.out.println(result);

    }

    private static String printEvenColumns(int n, int m, int[][] grid) {
        //ArrayList<Integer> list = new ArrayList<>();
        String res = "";
        for(int i = 0;i < n; i++)
        {
            if(i%2 != 0) {
                for (int j = 0; j < m; j++) {
                    res+=grid[i][j];
                }
            }
            else
            {
                continue;
            }
        }
        return res;
    }
}
