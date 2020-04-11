package com.kodilla.testing.shape;

class Triangle implements Shape{
    String triangle = "Rectangle";
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName(){
        return triangle;
    }

    public double getField(){
        return (a * h) / 2;
    }
}
