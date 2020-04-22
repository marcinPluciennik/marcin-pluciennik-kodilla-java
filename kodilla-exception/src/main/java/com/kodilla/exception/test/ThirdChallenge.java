package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main (String[] args){

        Flight flight = new Flight("KRK", "LON");

        Flightfinder flightfinder = new Flightfinder();

        try{
            flightfinder.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("********************************************");
            System.out.println("Your destination is not on our list, sorry.");
        }

        System.out.println("********************************************");
        System.out.println("Thank you for choosing our FlightFinder!");
        System.out.println("********************************************");

    }
}
