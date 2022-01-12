package com.revature;

import java.util.Scanner;

public class Uncaught_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("Result : "+c);
        System.out.println("Thank you!!!");
    }
}
