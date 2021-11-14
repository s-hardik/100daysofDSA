package com.company.SortingAlgo;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

       int[] arr ={ 14, 7, 3, 12, 9, 11, 6, 2};
       int start = 0, end = arr.length-1;
        mergeSort(arr, start, end);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void mergeSort(int[] arr, int start, int end){
        if(start<end)
        {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            mergeArr(arr, start, end, mid);
        }

    }


    public static void mergeArr(int[] arr, int start, int end, int mid){
        int[] temp = new int[end-start+1];

        int i=start, j = mid+1, k=0;

        while(i<=mid && j<=end)
        {
            if(arr[i]<=arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<=end)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int x = start; x<=end;x++)
        {
            arr[x] = temp[x-start];
        }
    }
}
