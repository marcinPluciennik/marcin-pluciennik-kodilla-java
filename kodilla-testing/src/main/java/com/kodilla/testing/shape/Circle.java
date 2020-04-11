package com.kodilla.testing.shape;

class Circle implements Shape{
    String circle = "Circle";
    double radiuosOfCircle;

    public Circle(double radiuosOfCircle) {
        this.radiuosOfCircle = radiuosOfCircle;
    }

    public String getShapeName(){
        return circle;
    }

    public double getField(){
        return 3.14 * radiuosOfCircle * radiuosOfCircle;
    }
}