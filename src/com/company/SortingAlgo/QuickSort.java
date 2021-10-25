package com.company.SortingAlgo;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,5,2,7,8,0,1,3};
        int low = 0;
        int high = arr.length-1;

        int[] res = quickSortImpl(arr, low, high);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }

    static int[] quickSortImpl(int[] arr, int low, int high){
        if(low<high)
        {
            int idx = partition(arr, low, high);
            quickSortImpl(arr, low, idx-1);
            quickSortImpl(arr, idx+1,high);
        }
        return arr;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int p = low;
        for(int i=low;i<high;i++)
        {
            if(arr[i]<=pivot)
            {
                swap(arr, i, p);
                p++;
            }
        }
        swap(arr, p, high);
        return p;
    }

    static void swap(int[] arr, int idx1, int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
