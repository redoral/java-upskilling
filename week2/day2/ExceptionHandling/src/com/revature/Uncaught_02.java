package com.revature;

import java.util.Scanner;

public class Uncaught_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int c = calc(a, b);
        System.out.println("Result : "+c);
    }
    public static int calc(int a, int b){
        int res ;
        res = a / b;
        System.out.println("End of the calculation");
        return res;
    }
}
