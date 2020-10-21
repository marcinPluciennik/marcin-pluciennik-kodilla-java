package com.kodilla.exception.test;

import java.util.HashMap;

public class Flightfinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightsMap = new HashMap<String, Boolean>();
        flightsMap.put("JFK", true);
        flightsMap.put("LAX", false);
        flightsMap.put("KRK", true);
        flightsMap.put("BCN", false);

        if (flightsMap.containsKey(flight.getArrivalAirport()) &&
                flightsMap.get(flight.getArrivalAirport()) == true) {
            System.out.println("********************************************");
            System.out.println("Today is your lucky day! I found the flight!");
        } else {
            throw new RouteNotFoundException("There is no flights");
        }


    }
}
