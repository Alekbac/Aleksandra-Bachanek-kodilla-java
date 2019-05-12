package com.kodilla.good.patterns.Airport;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Flights flights = new Flights();
        Set<Airports> search = flights.getListOfFlights();

        System.out.println("Search flight from: ");
        FlightSearcher searchFlightFrom = new FlightSearcher();
        searchFlightFrom.showFlightsFrom( search, "Ber");
        System.out.println(" ");

        System.out.println("Search flight to: ");
        FlightSearcher searchFlightTo = new FlightSearcher();
        searchFlightTo.showFlightsTo( search, "Waw");
        System.out.println(" ");

        System.out.println("Search flight trough: ");
        FlightSearcher searchFlight = new FlightSearcher();
        searchFlight.showAvailableConnection( search, "Ber", "Poz"  );
    }
}
