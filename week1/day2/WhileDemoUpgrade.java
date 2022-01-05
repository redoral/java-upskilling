package com.revature;

import java.util.Scanner;

// Upgrade the demo of while with ROI including in the Loan and EMI
public class WhileDemoUpgrade {
    public static void main(String[] args){
        int loan = 10000;
        int emi = 1000;
        int noemis = 0;
        double roi = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interest rate percent: ");
        roi = sc.nextInt();

        while(loan > 0){
            loan += ((roi/100) * loan) - emi;
            noemis++;
            System.out.println("Paying " + emi + " of the installment " + noemis);
            System.out.println("Remaining: " + loan);
        }

        System.out.println("You are free from the loan after " + noemis + " installments has been paid.");
    }
}
