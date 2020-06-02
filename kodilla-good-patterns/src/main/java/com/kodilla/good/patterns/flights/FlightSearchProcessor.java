package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

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

        List<Flight> flightsFrom = flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityFrom().equals(cityFrom.toUpperCase()))
                .collect(Collectors.toList());

        List<Flight> flightsTo = flightsData.getListOfFlights().stream()
                .filter(f -> f.getCityTo().equals(cityTo.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println("\nSelect one of the following flights as your first flight:");

        List<Flight> myFlightsFrom = flightsFrom.stream()
                .filter(f ->
                        (flightsTo.stream()
                        .map(Flight::getCityFrom)
                        .collect(Collectors.toList()))
                .contains(f.getCityTo()))
                .collect(Collectors.toList());

          myFlightsFrom.stream()
                .forEach(System.out::println);

        System.out.println("\nSelect one of the following flights as your second flight:");
        System.out.println("\n" +
                "(if departure time of second flight is earlier than departure time of first flight " +
                "\nthen it is necessary to spend the night in a transfer city)");
        List<Flight> myFlightsTo = flightsTo.stream()
                .filter(f ->
                        (flightsFrom.stream()
                        .map(Flight::getCityTo)
                        .collect(Collectors.toList()))
                .contains((f.getCityFrom())))
                .collect(Collectors.toList());

        myFlightsTo.stream()
                .forEach(System.out::println);
    }
}
