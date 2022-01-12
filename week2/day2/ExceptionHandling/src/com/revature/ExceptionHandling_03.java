package com.revature;

import java.util.Scanner;

public class ExceptionHandling_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        try{
            int c = calc(a, b);
            System.out.println("Result : "+c);
        }
        catch (ArithmeticException ae){
            System.out.println("Not possible to calculate : "+ae.getMessage());
            ae.printStackTrace();
        }
        System.out.println("Thank you!!!");


    }
    public static int calc(int a, int b){
        int res ;
        try{
            res = a / b;
            return res;
        }
        finally {
            System.out.println("End of the calculation");
        }
    }
}
