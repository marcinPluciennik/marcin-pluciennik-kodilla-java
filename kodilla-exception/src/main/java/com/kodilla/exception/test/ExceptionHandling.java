package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 0);
        } catch (Exception e) {
            System.out.println("Error: x >= 2 or x < 1 or y = 1.5!");
        }
    }
}
