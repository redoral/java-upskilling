package com.revature.Employee;

public class Manager extends Employee {

    public int qual;

    public Manager(int qual) {
        this.qual = qual;
    }

    public Manager(int qual, Long id, String name){
        super(id, name);
        this.qual = qual;
    }

    public int getQual() {
        return qual;
    }

    public void setQual(int qual) {
        this.qual = qual;
    }
}