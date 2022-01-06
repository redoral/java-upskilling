package com.revature.polygon;

public class Triangle extends Polygon{

    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double getArea(){
        return 0.5 * dim1 * dim2;
    }
}
