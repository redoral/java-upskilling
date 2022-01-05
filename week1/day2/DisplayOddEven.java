package com.revature;

import java.util.Scanner;

// WAP to display numbers for 1 to n (n - is the range given by the user during the execution)
//  and display even or odd next to each number
public class DisplayOddEven {

    public static void main(String[] args){
        // Variables
        int range;

        // Scanner init
        Scanner sc = new Scanner(System.in);

        // Prompt
        System.out.print("Enter range: ");
        range = sc.nextInt();

        // For loop to loop from 1 to defined range
        for (int i = 1; i < range; i++){

            // Checks if current number is odd or even using the remainder
            if ((i % 2) == 0){
                System.out.println(i + " - Even");
            } else {
                System.out.println(i + " - Odd");
            }

        }
    }
}
