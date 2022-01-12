package com.revature;

import java.util.Scanner;

public class ExceptionHandling_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        try{
            int c = a / b;
            System.out.println("Result : "+c);
        }
        catch (ArithmeticException arithmeticException){
//            System.out.println("Not possible to divide : "+arithmeticException);
            arithmeticException.printStackTrace();
        }
        System.out.println("Thank you!!!");
    }
}
