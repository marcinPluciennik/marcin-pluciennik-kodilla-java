package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector{
    private ArrayList<Shape> figures = new ArrayList<Shape>(); //List


    public void addFigure(Shape shape){
        Shape circle = new Circle(10.0);
        figures.add(circle);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 || n < figures.size()){
            shape = figures.get(n);
        }
        return shape;
    }

    public ArrayList<Shape> getFigures() {
        return figures;
    }

    public void showFigures(){
        System.out.println(figures);
    }
}
