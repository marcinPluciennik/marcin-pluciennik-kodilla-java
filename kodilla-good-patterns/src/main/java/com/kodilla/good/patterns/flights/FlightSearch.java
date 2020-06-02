package com.kodilla.good.patterns.flights;

public class FlightSearch {

    public static void main(String[] args){

        FlightsData flightsData = new FlightsData();

        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor();

        flightSearchProcessor.searchingFlightsFrom(flightsData, "GDANSK");
        flightSearchProcessor.searchingFlightsTo(flightsData, "GDANSK");
        flightSearchProcessor.searchingConnectedFlights(flightsData, "GDANSK", "CRACOW");
    }
}
