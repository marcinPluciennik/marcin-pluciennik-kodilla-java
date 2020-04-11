package com.kodilla;

public class Calculator {
    int x;
    int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void addition(){
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public void subtraction(){
        System.out.println(x + " - " + y + " = " + (x - y));
    }

    public static void main (String[] args){

        System.out.println("Hello GIT, hello InelliJ");
        Calculator myCalculator = new Calculator(10,10);
        myCalculator.addition();
        myCalculator.subtraction();

    }
}
