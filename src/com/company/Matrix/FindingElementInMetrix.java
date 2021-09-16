package com.company.Matrix;

import java.util.Scanner;

public class FindingElementInMetrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int traget = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = findTragetElement(n, grid,traget);

        System.out.println(result);

}

    private static String findTragetElement(int n, int[][] grid, int traget) {
        String res = "No";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==traget)
                {
                    res = "yes";
                }
            }
        }
        return res;
    }
    }
