package com.revature.polygon;

public class Rectangle extends Polygon {

    public Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double getArea(){
        return (dim1*2) * (dim2*2);
    }

}
