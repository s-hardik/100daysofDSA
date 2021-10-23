package com.company.Matrix;

import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] temp = new int[n][m];//creating a extra matrix of mxn with all element 1
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                temp[i][j] =1;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k = 0;k<m;k++)
                    {
                        temp[i][k] = 0;
                    }
                    for(int l = 0;l<n;l++)
                    {
                        temp[l][j] = 0;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] *= temp[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
/*
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/
