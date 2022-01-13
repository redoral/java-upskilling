package com.revature.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorSubtractTestWithParams {
    int num1;
    int num2;
    int result;
    Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    public CalculatorSubtractTestWithParams(Integer num1, Integer num2, Integer result){
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection values(){
        return Arrays.asList(new Object[][]{
                {10, 3, 7},
                {15, 4, 11},
                {9, 4, 5},
                {14, 9, 5}
        });
    }


    @Test
    public void subtract() {
        assertEquals(result, calculator.subtract(num1, num2));
    }
}