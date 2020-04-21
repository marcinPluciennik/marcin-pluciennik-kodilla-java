package com.kodilla.exception.test;

import java.lang.*;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if ( b == 0){
                throw new ArithmeticException();
            }
            return a / (int)b;
        } catch (ArithmeticException ae) {
            System.out.println("I can not divide by zero! Error: " + ae);
            return 0;
        } finally {
            System.out.println("Thank you!");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}