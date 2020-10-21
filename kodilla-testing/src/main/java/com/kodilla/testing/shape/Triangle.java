package com.kodilla.testing.shape;

class Triangle implements Shape {
    String triangle = "Rectangle";
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return triangle;
    }

    public double getField() {
        return (a * h) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle1 = (Triangle) o;

        if (Double.compare(triangle1.a, a) != 0) return false;
        if (Double.compare(triangle1.h, h) != 0) return false;
        return triangle.equals(triangle1.triangle);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = triangle.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
