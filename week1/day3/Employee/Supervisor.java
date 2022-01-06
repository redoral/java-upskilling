package com.revature.Employee;

public class Supervisor extends Employee {

    public int exper;

    public Supervisor(int exper) {
        this.exper = exper;
    }

    public Supervisor(Long id, String name, int exper) {
        super(id, name);
        this.exper = exper;
    }

    public int getExper() {
        return exper;
    }

    public void setExper(int exper) {
        this.exper = exper;
    }
}