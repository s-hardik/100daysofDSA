package com.company;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        //Conveting ddecimal to binary
        //int[] arr = new int[10];
        List arraylist = new ArrayList();
        int i=0;

        while(n>=1){
            arraylist.add(n%2);
            n=n/2;
            i++;
        }
        int counter = 0;
        int temp = 0;
        TreeSet <Integer> ts = new TreeSet<Integer>();//tree set stroes in sorted order and stores only unique
        //both side same class shuld be there to use inbuilt method.
        //
        //System.out.print(arraylist);
        for(int j=arraylist.size()-1;j>=0;j--){
            //System.out.print(arraylist.get(j));
          if ((int) arraylist.get(j)==1){
              counter = counter+1;
              ts.add(counter);
          }
          else{
              counter=0;
          };

        }
        //System.out.println(ts);
        System.out.println("\n"+ ts.last());
        bufferedReader.close();
    }
}
