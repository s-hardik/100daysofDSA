package com.company;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int result = secondLargestElement(n, arr);
        System.out.println(result);
    }

    static int secondLargestElement(int n, int[] arr) {
        int largestElement = 0, secondLargest = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largestElement)//comparing largest element with array elements, it its bigger than store largest to 2nd largest
                //and array  element to largest
            {
                secondLargest = largestElement;
                largestElement = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largestElement)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
