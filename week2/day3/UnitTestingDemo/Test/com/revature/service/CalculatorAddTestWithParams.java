package com.revature.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorAddTestWithParams {

    int num1;
    int num2;
    int sum;
    Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    public CalculatorAddTestWithParams(Integer num1, Integer num2, Integer sum){
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }

    @Parameterized.Parameters
    public static Collection values(){
        return Arrays.asList(new Object[][]{
                {1, 3, 4},
                {2, 6, 8},
                {3, 4, 7},
                {5, 9, 14}
        });
    }

    @Test
    public void add() {
        assertEquals(sum, calculator.add(num1, num2));
    }
}