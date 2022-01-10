package com.revature;

import java.util.Scanner;
import java.util.TreeSet;

// TreeList example app
//  Simple unique list program
public class TreeSetExample {

    public static void main(String[] args) {
        // Items var used to see how many times the loop will run
        int items;

        // Scanner and TreeSet init
        Scanner sc = new Scanner(System.in);
        TreeSet treeSet = new TreeSet<String>();

        // Prompt to ask how many items the user wants to be list
        //  assigns given number to items var
        System.out.print("Enter amount of unique items you want to list: ");
        items = sc.nextInt();

        // Skips to next line, adds a line break for formatting
        sc.nextLine();
        System.out.println();

        // Loops through 'items' var
        //  adds every item user inputs to the arrayList
        for (int i = 0; i < items; i++){
            System.out.println("Enter item #" + (i+1));
            treeSet.add(sc.nextLine());
        }

        // Prints out the arrayList
        System.out.println("\nYour unique list:");
        System.out.println(treeSet);
    }
}
