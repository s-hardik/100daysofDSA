package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BitWise {

    public static int bitwiseAnd(int N, int K){
        int a, b, res, result=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= N; i++) {
            a = i;
            for (int j = i + 1; j <= N; j++) {
                b = j;
                res = a & b;
                list.add(res);
            }
        }
        Collections.sort(list);
        for (int q = list.size() - 1; q >= 0; q--) {
            //System.out.println(list.get(q));
            if (list.get(q) < K) {
                result = list.get(q);
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        System.out.println(bitwiseAnd(N, K));

    }
}
