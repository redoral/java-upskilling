package com.revature;

import java.util.Scanner;

public class Array1D {

    public static void main(String[] args) {
        int[] arr;
        int sum = 0;
        int max = 0;
        int min = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("How many elements will you enter: ");
        int size = input.nextInt();
        arr = new int[size];

        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Elements you have entered: ");
        for (int i = 0; i<arr.length; i++){
            max = arr[0];
            for (int j = 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }

            min = arr[0];
            for (int j = 1; j<arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                }
            }

            sum+=arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
