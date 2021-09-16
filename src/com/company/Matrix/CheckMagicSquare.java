package com.company.Matrix;

import java.util.Scanner;

public class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {

        //calculating sum of diagonals
        int D1sum = 0, D2sum=0;
        for(int i=0;i<n;i++)
        {
            D1sum +=grid[i][i];
            D2sum +=grid[i][n-1-i];
        }

        //checking if diagonal sum is equal or not

        if(D1sum!=D2sum)
        {
            return "No";
        }

        //comparing diagonal sum with each row and column sum
        //int rowSum=0, columnSum=0;
        for(int i=0;i<n;i++)
        {
            int rowSum=0, columnSum=0;
            for(int j=0;j<n;j++)
            {
                rowSum += grid[i][j];
                columnSum +=grid[j][i];//row and column sum can be calculated with single iterationof loop
                //at a time only one value is varying wheather its column or row.
            }
            if(rowSum!=D1sum || columnSum!=D1sum)
            {
                return "No";
            }
        }
        return "Yes";
    }
}
