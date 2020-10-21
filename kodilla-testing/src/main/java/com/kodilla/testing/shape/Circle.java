package com.kodilla.testing.shape;

class Circle implements Shape {
    String circle = "Circle";
    double radiuosOfCircle;

    public Circle(double radiuosOfCircle) {
        this.radiuosOfCircle = radiuosOfCircle;
    }

    public String getShapeName() {
        return circle;
    }

    public double getField() {
        return 3.14 * radiuosOfCircle * radiuosOfCircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle1 = (Circle) o;

        if (Double.compare(circle1.radiuosOfCircle, radiuosOfCircle) != 0) return false;
        return circle.equals(circle1.circle);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = circle.hashCode();
        temp = Double.doubleToLongBits(radiuosOfCircle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}