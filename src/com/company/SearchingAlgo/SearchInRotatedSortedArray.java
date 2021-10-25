package com.company.SearchingAlgo;

import java.util.Scanner;

class SearchInRotatedSortedArray {

    // Complete the function implementation below
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int pivotIdx = -1;
        int result = -1;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1])
            {
                pivotIdx = mid;
            }
            if(nums[mid]<nums[mid-1])
            {
                pivotIdx = mid-1;
            }

            if(nums[low]>nums[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        //System.out.println(pivotIdx);
        if(pivotIdx !=-1)
        {
            result = binarySearch(nums, low, pivotIdx, target);
            if(result==-1)
            {
                result = binarySearch(nums, pivotIdx+1,high,target);
                return result;
            }
        }
        else{
            result =  binarySearch(nums,low,high,target);
            return result;
        }

        return result;
    }

    public static int binarySearch(int[] nums, int low, int high, int target)
    {
        int res = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;

            if(nums[mid] == target)
            {
                res = mid;
                return res;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while(q > 0) {
            int target = scanner.nextInt();
            int result = new SearchInRotatedSortedArray().search(nums , target);
            System.out.println(result);
            q--;
        }
    }
}

