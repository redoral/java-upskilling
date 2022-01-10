package com.revature;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList example app
//  Simple list program
public class ArrayListExample {

    public static void main(String[] args) {
        // Items var used to see how many times the loop will run
        int items;

        // Scanner and arrayList init
        Scanner sc = new Scanner(System.in);
        ArrayList arrayList = new ArrayList<String>();

        // Prompt to ask how many items the user wants to be list
        //  assigns given number to items var
        System.out.print("Enter amount of items you want to list: ");
        items = sc.nextInt();

        // Skips to next line, adds a line break for formatting
        sc.nextLine();
        System.out.println();

        // Loops through 'items' var
        //  adds every item user inputs to the arrayList
        for (int i = 0; i < items; i++){
            System.out.println("Enter item #" + (i+1));
            arrayList.add(sc.nextLine());
        }

        // Prints out the arrayList
        System.out.println("\nYour list:");
        System.out.println(arrayList);
    }
}
