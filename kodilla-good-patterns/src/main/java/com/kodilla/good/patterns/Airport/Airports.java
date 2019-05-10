package com.kodilla.good.patterns.Airport;

public class Airports {
    private String arrivalCity;
    private String departureCity;

    public Airports(String arrivalCity, String departureCity) {
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airports)) return false;

        Airports airports = (Airports) o;

        if (getArrivalCity() != null ? !getArrivalCity().equals( airports.getArrivalCity() ) : airports.getArrivalCity() != null)
            return false;
        return getDepartureCity() != null ? getDepartureCity().equals( airports.getDepartureCity() ) : airports.getDepartureCity() == null;

    }

    @Override
    public int hashCode() {
        int result = getArrivalCity() != null ? getArrivalCity().hashCode() : 0;
        result = 31 * result + (getDepartureCity() != null ? getDepartureCity().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "arrivalCity='" + arrivalCity + '\'' +
                ", departureCity='" + departureCity + '\'' +
                '}';
    }
}
