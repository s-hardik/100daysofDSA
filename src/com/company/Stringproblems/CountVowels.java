package com.company.Stringproblems;

import java.util.Scanner;

class CountVowels {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    // TODO: Implement this method
    static int countVowels(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'
                    || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
            {
                count++;
            }
        }
        return count;
    }
}
