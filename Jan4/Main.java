package com.revature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Options variables
        int option;
        int calcOption;
        int convertOption;

        // Value variables
        double a;
        double b;
        double c;

        // Base and height for triangle
        double base;
        double height;

        Scanner sc = new Scanner(System.in);

        // Main menu
        System.out.println("Welcome to Red's hot and cool app! Select one of the options below:");
        System.out.println("1. Calculate");
        System.out.println("2. Convert");
        System.out.print("Enter choice (1/2): ");
        option = sc.nextInt();

        // Calculate
        if (option == 1){
            System.out.println("=====================\nCALCULATE\n=====================");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");

            System.out.print("Enter choice (1-3): ");
            calcOption = sc.nextInt();

            // Triangle
            if (calcOption == 1) {
                // Triangle value scanners
                System.out.println("\nTRIANGLE");
                System.out.print("Side A: ");
                a = sc.nextDouble();
                System.out.print("Side B: ");
                b = sc.nextDouble();
                System.out.print("Side C: ");
                c = sc.nextDouble();
                System.out.print("Base: ");
                base = sc.nextDouble();
                System.out.print("Height: ");
                height = sc.nextDouble();

                // Calculates area and perimeter
                double perimeter = a+b+c;
                double area = 0.5 * base * height;

                // Prints out area and perimeter
                System.out.println("Perimeter = " + perimeter);
                System.out.println("Area = " + area);

            // Rectangle
            } else if (calcOption == 2) {
                // Rectangle value scanners
                System.out.println("\nRECTANGLE");
                System.out.print("Width: ");
                a = sc.nextDouble();
                System.out.print("Length: ");
                b = sc.nextDouble();

                // Calculates area and perimeter
                double area = a * b;
                double perimeter = 2 * area;

                // Prints out area and perimeter
                System.out.println("Area = " + area);
                System.out.println("Perimeter = " + perimeter);

            // Circle
            } else if (calcOption == 3) {
                // Circle radius value scanner
                System.out.println("\nCIRCLE");
                System.out.print("Radius: ");
                a = sc.nextDouble();

                // Calculates area and perimeter
                double area = a * a * Math.PI;
                double perimeter = 2 * a * Math.PI;

                // Prints out area and perimeter
                System.out.println("Area = " + area);
                System.out.println("Perimeter = " + perimeter);
            } else {
                System.out.println("Invalid option. That's not very cool of you.");
            }

        // Convert
        } else if (option == 2){
            System.out.println("=====================\nCONVERT\n=====================");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Centimeter to Inches");
            System.out.println("4. Inches to Centimeter");

            System.out.print("Choose option (1-4): ");
            convertOption = sc.nextInt();

            // Celsius to fahrenheit
            if (convertOption == 1) {
                // Celsius value scanner
                System.out.println("\nC to F");
                System.out.print("Enter degree: ");
                a = sc.nextDouble();

                // Calculates and prints out converted result
                System.out.println(a + " celsius = " + (a *(9.0 / 5.0) + 32) + " fahrenheit");

            // Fahrenheit to celsius
            } else if (convertOption == 2) {
                // Fahrenheit value scanner
                System.out.println("\nF to c");
                System.out.print("Enter degree: ");
                a = sc.nextDouble();

                // Calculates and prints out converted result
                System.out.println(a + " fahrenheit = " + ((a - 32) * (5.0 / 9.0)) + " celsius");

            // Centimeters to inches
            } else if (convertOption == 3) {
                // Centimeter value scanner
                System.out.println("\ncm to in");
                System.out.print("Enter centimeters: ");
                a = sc.nextDouble();

                // Calculates and prints out converted result
                System.out.println(a + " centimeters = " + (a / 2.54) + " inches");
            // Inches to centimeters
            } else if (convertOption == 4) {
                // Inch value scanner
                System.out.println("\nin to cm");
                System.out.print("Enter centimeters: ");
                a = sc.nextDouble();

                // Calculates and prints out converted result
                System.out.println(a + " inches = " + (a * 2.54) + " centimeters");
            } else {
                System.out.println("Invalid option. That's not very cool of you.");
            }

        } else {
            System.out.println("Invalid option. That's not very cool of you.");
        }
    }
}