package com.revature.service;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator ;

    @BeforeClass
    public static void meth1(){
        System.out.println("Hello");
    }

    @AfterClass
    public static void meth2(){
        System.out.println("Bye");
    }

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @After
    public void cleanup(){
        calculator = null;
    }

    @Test
    public void addAndTestEqual() {
        int res = calculator.add(5, 7);
        assertEquals(12, res);
    }

    @Test
    public void addAndTestNotEquals(){
        int res = calculator.add(5, 7);
        assertNotEquals(15, res);
    }

    @Test
    public void subtractAndTestEqual() {
        int res = calculator.subtract(10, 3);
        assertEquals(7, res);
    }

    @Test
    public void subtractAndTestNotEqual(){
        int res = calculator.subtract(10,3);
        assertNotEquals(3, res);
    }


}