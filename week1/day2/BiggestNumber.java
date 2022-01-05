package com.revature;

import java.util.Scanner;

// WAP to find biggest of given 3 numbers using nested if... else
public class BiggestNumber {

    public static void main(String[] args){
       // Variables
        int a;
        int b;
        int c;

        // Scanner init
        Scanner sc = new Scanner(System.in);

        // Prompts
        System.out.print("First number: ");
        a = sc.nextInt();
        System.out.print("Second number: ");
        b = sc.nextInt();
        System.out.print("Third number: ");
        c = sc.nextInt();

        // Checks which variable holds the biggest number
        if ((a > b && a > c) || (a == b && a > c)){
            System.out.println("\nBiggest number: " + a);
        } else if (b > a && b > c){
            System.out.print("\nBiggest number: " + b);
        } else {
            System.out.println("\nBiggest number: " + c);
        }
    }

}
