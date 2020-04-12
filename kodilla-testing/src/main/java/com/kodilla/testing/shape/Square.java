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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square1 = (Square) o;

        if (Double.compare(square1.a, a) != 0) return false;
        if (Double.compare(square1.b, b) != 0) return false;
        return square.equals(square1.square);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = square.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
