package com.kodilla.good.patterns.flights;

public class FlightSearchProcessor {
    final String GDANSK = "GDANSK";
    final String WROCLAW = "WROCLAW";

    PrintLine printLine = new PrintLine();

    public void searchingFlightsFromGdansk(FlightsData flightsData){
        printLine.printingLine();
        System.out.println("ALL FLIGHTS FROM GDANSK:");
        printLine.printingLine();
        flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityFrom().equals(GDANSK))
                .forEach(System.out::println);
    }

    public void searchingFlightsToGdansk(FlightsData flightsData){
        printLine.printingLine();
        System.out.println("ALL FLIGHTS TO GDANSK:");
        printLine.printingLine();
        flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityTo().equals(GDANSK))
                .forEach(System.out::println);
    }

    public void searchingConnectedFlightsFromGdanskToWroclaw(FlightsData flightsData){
        printLine.printingLine();
        System.out.println("ALL CONNECTED FLIGHTS FROM GDANSK TO WROCLAW:");
        printLine.printingLine();
        flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityFrom().equals(GDANSK))
                .filter(f -> f.getCityTo().equals(WROCLAW))
                .filter(f -> f.isConnected() == true)
                .forEach(System.out::println);
    }
}
