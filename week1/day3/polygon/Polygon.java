package com.revature.polygon;

abstract class Polygon {
    protected double dim1;
    protected double dim2;

    public Polygon(){ }

    public Polygon(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();
}
