package com.kodilla.testing.shape;

class Square implements Shape{
    String square = "Square";
    double a;
    double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getShapeName(){
        return square;
    }

    public double getField(){
        return a * b;
    }
}
