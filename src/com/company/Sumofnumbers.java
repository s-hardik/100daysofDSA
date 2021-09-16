package com.company;

import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int result =0;
        for(int i=0;i<=n;i++){
            result+=i;
        }
        System.out.println(result);
    }
}
