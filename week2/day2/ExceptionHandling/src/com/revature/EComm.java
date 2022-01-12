package com.revature;

import com.revature.exception.InsufficientFundException;

import java.util.Scanner;

public class EComm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance in the account : ");
        int bal = sc.nextInt();
        System.out.print("Enter cost of the product to place order : ");
        int cost = sc.nextInt();
        try{
            bal = placeOrder(bal, cost);
            System.out.println("Updated balance after placing the order : "+bal);
        }
        catch (InsufficientFundException insufficientFundException){
            System.out.println(insufficientFundException.getMessage());
            insufficientFundException.printStackTrace();
        }
        System.out.println("Thank you for using EComm Application");
    }
    public static int placeOrder(int balance, int cost) throws InsufficientFundException{
        int updatedBal;
        if(balance < cost){
            InsufficientFundException insufficientFundException = new InsufficientFundException("Insufficient fund "+balance+
                                                                        " to place order at the cost "+cost);
            throw insufficientFundException;
        }
        updatedBal = balance - cost;
        return updatedBal;
    }
}
