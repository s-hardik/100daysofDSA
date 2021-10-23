package com.company.Arrays;

public class MaxSumofSubArray {

    public static void main(String[] args) {

        int[] arr  = {1,2,3,4,5,6,7,8,9};
        int k=3;
        //int j=k-1;
        int start = 0, end = k-1, currentSum = 0;
        for(int i = start; i<=end;i++)
        {
            currentSum +=arr[i];

        }
        System.out.println(currentSum + " ");

        while(end<arr.length-1)
        {
            start++;
            end++;
            currentSum = currentSum-arr[start-1]+arr[end];
            System.out.println(currentSum + " ");
        }
    }
    }
