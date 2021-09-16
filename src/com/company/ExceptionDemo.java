package com.company;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        try {
            updateBalance(balance);
            int c = balance/0;
        } catch (InvalidBalanceException e) {
            System.out.println("Inside the catch block");
            e.printStackTrace();
        } finally {
            System.out.println("Inside the finally block");
        }
    }

    private static void updateBalance(int balance) throws InvalidBalanceException{
        if(balance<0){
            throw (new InvalidBalanceException("Balance can not be less than 0"));
        }
        else{
            System.out.println("Balance Updated successfully");
        }

    }
}
