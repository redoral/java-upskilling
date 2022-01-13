package com.revature.app;

import com.revature.beans.CalculatorFunction;

public class Main {

    public static void main(String[] args) {
        // Defines the abstract methods from the functional interface
        CalculatorFunction calculatorFunctionAdd = (a,b)-> a+b;
        CalculatorFunction calculatorFunctionSubtract = (a,b)-> a-b;
        CalculatorFunction calculatorFunctionMultliply = (a,b)-> a*b;
        CalculatorFunction calculatorFunctionDivide = (a,b)-> a/b;

        // Calls the methods
        int add = calculatorFunctionAdd.calculate(2,2);
        int sub = calculatorFunctionSubtract.calculate(5,3);
        int mul = calculatorFunctionMultliply.calculate(10,10);
        int div = calculatorFunctionDivide.calculate(10,2);

        // Prints out the results
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
