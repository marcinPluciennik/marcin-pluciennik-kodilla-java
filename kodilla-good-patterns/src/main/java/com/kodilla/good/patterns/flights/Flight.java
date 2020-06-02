package com.kodilla.good.patterns.flights;

public class Flight {
    private String cityFrom;
    private String cityTo;
    private String time;
    private boolean isConnected;

    public Flight(String cityFrom, String cityTo, String time, boolean isConnected) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.time = time;
        this.isConnected = isConnected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (isConnected != flight.isConnected) return false;
        if (cityFrom != null ? !cityFrom.equals(flight.cityFrom) : flight.cityFrom != null) return false;
        if (cityTo != null ? !cityTo.equals(flight.cityTo) : flight.cityTo != null) return false;
        return time != null ? time.equals(flight.time) : flight.time == null;
    }

    @Override
    public int hashCode() {
        int result = cityFrom != null ? cityFrom.hashCode() : 0;
        result = 31 * result + (cityTo != null ? cityTo.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (isConnected ? 1 : 0);
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

    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public String
    toString() {
        return "\nFrom: " + cityFrom + " , " +
                "To: " + cityTo + " , " +
                "Time: " + time + " , " +
                "Is Connected: " + isConnected;
    }
}
