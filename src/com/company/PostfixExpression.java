package com.company;

import java.util.Scanner;
import java.util.Stack;

class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) {

        Stack<Integer> stk = new Stack<Integer>();
        String[] arr = exp.split(" ");
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*"))
            {
                int firstOperand = (int)stk.pop();
                System.out.println(firstOperand);
                int secondOperand =(int)stk.pop();
                System.out.println(secondOperand);
                int res = 0;
                if(arr[i].equals("+") )
                {
                    System.out.println("Into + if*****");
                    res = firstOperand + secondOperand;
                    //stk.push(res);
                }
                else if(arr[i].equals("-"))
                {
                    res = firstOperand-secondOperand;
                }
                else{
                    res = firstOperand * secondOperand;
                }
                stk.push(res);
            }
            else
            {
                stk.push(Integer.parseInt(arr[i]));
            }
        }
        return (int)stk.peek();
    }
}