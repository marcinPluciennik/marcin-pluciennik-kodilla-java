package com.kodilla.good.patterns.flights;

public class Flight {
    private String cityFrom;
    private String cityTo;
    private String time;

    public Flight(String cityFrom, String cityTo, String time) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.time = time;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (cityFrom != null ? !cityFrom.equals(flight.cityFrom) : flight.cityFrom != null) return false;
        return cityTo != null ? cityTo.equals(flight.cityTo) : flight.cityTo == null;
    }

    @Override
    public int hashCode() {
        int result = cityFrom != null ? cityFrom.hashCode() : 0;
        result = 31 * result + (cityTo != null ? cityTo.hashCode() : 0);
        return result;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String
    toString() {
        return "\nFrom: " + cityFrom + " , " +
                "To: " + cityTo + " , " +
                "Time: " + time;
    }
}
