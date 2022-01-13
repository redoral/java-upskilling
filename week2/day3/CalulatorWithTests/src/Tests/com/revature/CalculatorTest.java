package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    // Calculator instances
    Calculator calc;
    Calculator calc2;

    // Define all Calculator instances before each test
    //  calc is the only one used on all method test
    //    calc2 was created to cover @NoArgsConstructor annotation from Lombok
    @Before
    public void init(){
        calc = new Calculator(8,2);
        calc2 = new Calculator();
    }

    // Sets the Calculator instances to null after each test
    @After
    public void complete(){
        calc = null;
        calc2 = null;
    }

    // add() tests
    @Test
    public void addTestEquals(){
        int result = calc.add();
        assertEquals(10, result);
    }

    @Test
    public void addTestNotEquals(){
        int result = calc.add();
        assertNotEquals(6, result);
    }

    // subtract() tests
    @Test
    public void subtractTestEquals(){
        int result = calc.subtract();
        assertEquals(6, result);
    }

    @Test
    public void subtractTestNotEquals(){
        int result = calc.subtract();
        assertNotEquals(10, result);
    }

    // multiply() tests
    @Test
    public void multiplyTestEquals(){
        int result = calc.multiply();
        assertEquals(16, result);
    }

    @Test
    public void multiplyTestNotEquals(){
        int result = calc.multiply();
        assertNotEquals(4, result);
    }

    // divide() tests
    @Test
    public void divideTestEquals(){
        int result = calc.divide();
        assertEquals(4, result);
    }

    @Test
    public void divideTestNotEquals(){
        int result = calc.divide();
        assertNotEquals(16, result);
    }

}
