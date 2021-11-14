package com.company;

import java.util.*;

class CountDistinctElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = countDistinctElements(n, b, arr);

        for (int j : res)
            System.out.print(j + " ");

    }

    static ArrayList<Integer> countDistinctElements(int N, int B, int arr[]) {

       // HashSet<Integer> set = new HashSet();
        ArrayList<Integer> list = new ArrayList();
        //Brute Force Approach with time complexity O(n^2)
        // int i=0;
        // while(i<=N-B)
        // {
        //    int j=i;
        //     while(j<=i+B-1)
        //     {
        //         set.add(arr[j]);
        //         j++;
        //     }
        // list.add(set.size());
        // set.clear();
        // i++;

        // }

        // Optimised approached
        HashMap<Integer, Integer> map = new HashMap();
        int dist_count = 0;
        for(int i=0;i<B;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int x = map.get(arr[i]);
                map.put(arr[i], x+1);
            }
            else{
                map.put(arr[i], 1);
                dist_count += 1;
            }
        }
        list.add(dist_count);
        // System.out.print(dist_count);
        int left = 0, right = B;
        while(right<N)
        {
            if(map.containsKey(arr[left]))
            {
                int x = map.get(arr[left]);
                map.put(arr[left], x-1);
                if((int)map.get(arr[left])==0)
                {
                    dist_count--;
                }
            }

            if(map.containsKey(arr[right]))
            {
                int a = map.get(arr[right]);
                map.put(arr[right], a+1);
            }
            else{

                map.put(arr[right], 1);
                dist_count+=1;
            }
            list.add(dist_count);
            left++;
            right++;

        }
        return list;
    }
}

