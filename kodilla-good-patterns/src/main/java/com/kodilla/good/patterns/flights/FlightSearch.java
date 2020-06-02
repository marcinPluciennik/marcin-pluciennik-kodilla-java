package com.kodilla.good.patterns.flights;

public class FlightSearch {

    public static void main(String[] args){

        FlightsData flightsData = new FlightsData();

        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor();

        flightSearchProcessor.searchingFlightsFromGdansk(flightsData);
        flightSearchProcessor.searchingFlightsToGdansk(flightsData);
        flightSearchProcessor.searchingConnectedFlightsFromGdanskToWroclaw(flightsData);
    }
}
