package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsData {

    public List<Flight> getListOfFlights(){

        Flight flight1 = new Flight("GDANSK", "WROCLAW", "10:00");
        Flight flight2 = new Flight("WROCLAW", "CRACOW", "11:00");
        Flight flight3 = new Flight("WARSAW", "WROCLAW", "12:00");
        Flight flight4 = new Flight("GDANSK", "WARSAW", "13:00");
        Flight flight5 = new Flight("CRACOW", "GDANSK", "14:00");
        Flight flight6 = new Flight("GDANSK", "WROCLAW", "15:00");
        Flight flight7 = new Flight("WROCLAW", "GDANSK", "16:00");
        Flight flight8 = new Flight("GDANSK", "WROCLAW", "17:00");
        Flight flight9 = new Flight("GDANSK", "WROCLAW", "18:00");
        Flight flight10 = new Flight("WROCLAW", "GDANSK", "19:00");

        List<Flight> listOfFlights = new ArrayList<Flight>();

        listOfFlights.add(flight1);
        listOfFlights.add(flight2);
        listOfFlights.add(flight3);
        listOfFlights.add(flight4);
        listOfFlights.add(flight5);
        listOfFlights.add(flight6);
        listOfFlights.add(flight7);
        listOfFlights.add(flight8);
        listOfFlights.add(flight9);
        listOfFlights.add(flight10);

        return new ArrayList<Flight>(listOfFlights);
    }
}
