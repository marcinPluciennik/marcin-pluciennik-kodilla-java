package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightsData {
    /*
    Map<String, ArrayList<LocalTime>> departuresGdansk = new HashMap<String, ArrayList<LocalTime>();
    Map<String, ArrayList<LocalTime>> arrivalsGdansk = new HashMap<String, ArrayList<LocalTime>>();

    public FlightsData(HashMap<String, ArrayList<LocalTime>> departuresGdansk, HashMap<String, ArrayList<LocalTime>> arrivalsGdansk) {
        this.departuresGdansk = departuresGdansk;
        this.arrivalsGdansk = arrivalsGdansk;
    }

    public HashMap<String, ArrayList<LocalTime>> getDeparturesGdansk() {
        return departuresGdansk;
    }

    public HashMap<String, ArrayList<LocalTime>> getArrivalsGdansk() {
        return arrivalsGdansk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsData that = (FlightsData) o;

        if (departuresGdansk != null ? !departuresGdansk.equals(that.departuresGdansk) : that.departuresGdansk != null)
            return false;
        return arrivalsGdansk != null ? arrivalsGdansk.equals(that.arrivalsGdansk) : that.arrivalsGdansk == null;
    }

    @Override
    public int hashCode() {
        int result = departuresGdansk != null ? departuresGdansk.hashCode() : 0;
        result = 31 * result + (arrivalsGdansk != null ? arrivalsGdansk.hashCode() : 0);
        return result;
    }

    public void searchFlightsFromGdansk(){

    }

    public void searchFlightsToGdansk(){

    }

    public void searchConnectedFlightsFromGdanskToWroclaw(){

    }

     */
}
