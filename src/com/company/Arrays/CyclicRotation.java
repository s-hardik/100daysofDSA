package com.company.Arrays;

import java.util.Scanner;

public class CyclicRotation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    // TODO: Implement this method
    static int[] cyclicRotation(int n, int[] arr, int k) {
        while(k>0){
            int temp = arr[n-1];
            for(int i=n-2;i>=0;i--)
            {
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
        return arr;
    }
}
