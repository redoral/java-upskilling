package com.revature;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    int a;
    int b;

    // Add method
    public int add(){
        return this.a + this.b;
    }

    // Subtract method
    public int subtract(){
        return this.a - this.b;
    }

    // Multiply method
    public int multiply(){
        return this.a * this.b;
    }

    // Divide method
    public int divide(){
        return this.a / this.b;
    }
}
