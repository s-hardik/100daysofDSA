package com.company.SearchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr = {1,2,4,5,6,9,10,33,65,87};
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int res = -1;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target)
            {
                res = mid;
                return res;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return res;
    }
}
