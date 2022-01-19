package com.revature.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class App_01Test {

    @Test
    public void sayHello() {
        assertEquals("Hello, Red! Have a nice day!", App_01.sayHello("Red"));
    }
}