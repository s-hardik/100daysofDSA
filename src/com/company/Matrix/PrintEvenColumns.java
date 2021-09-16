package com.company.Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEvenColumns {
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
        for(int i = 0;i < m; i++)
        {
            if(i%2 != 0) {
                for (int j = 0; j < n; j++) {
                        res+=grid[j][i];
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
