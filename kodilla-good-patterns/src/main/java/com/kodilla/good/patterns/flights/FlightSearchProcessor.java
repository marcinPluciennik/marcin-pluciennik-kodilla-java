package com.kodilla.good.patterns.flights;

public class FlightSearchProcessor {

    PrintLine printLine = new PrintLine();

    public void searchingFlightsFrom(FlightsData flightsData, String city){
        printLine.printingLine();
        System.out.println("ALL FLIGHTS FROM THIS CITY:");
        printLine.printingLine();
        flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityFrom().equals(city.toUpperCase()))
                .forEach(System.out::println);
    }

    public void searchingFlightsTo(FlightsData flightsData, String city){
        printLine.printingLine();
        System.out.println("ALL FLIGHTS TO THIS CITY:");
        printLine.printingLine();
        flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityTo().equals(city.toUpperCase()))
                .forEach(System.out::println);
    }

    public void searchingConnectedFlights(FlightsData flightsData, String cityFrom, String cityTo){
        printLine.printingLine();
        System.out.println("ALL CONNECTED FLIGHTS:");
        printLine.printingLine();
        flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityFrom().equals(cityFrom.toUpperCase()))
                .filter(f -> f.getCityTo().equals(cityTo.toUpperCase()))
                .filter(f -> f.isConnected() == true)
                .forEach(System.out::println);
    }
}
