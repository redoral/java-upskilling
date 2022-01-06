package com.revature;

public class Rectangle {

    // Variables
    private double length;
    private double width;

    // Empty rectangle constructor
    public Rectangle(){ }

    // Rectangle constructor with all vars
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Gets the area from the provided length and width
    public double getArea(){
        return length * width;
    }

    // Gets the perimeter from the provided length and width
    public double getPerimeter(){
        return (length * 2) * (width * 2);
    }
}
