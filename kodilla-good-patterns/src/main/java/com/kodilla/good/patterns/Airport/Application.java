package com.kodilla.good.patterns.Airport;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Flights flights = new Flights();
        Set<Airports> search = flights.getListOfFlights();

        FlightSearcher searchFlightFrom = new FlightSearcher();
        searchFlightFrom.showFlightsFrom( search, "Waw");

        FlightSearcher searchFlightTo = new FlightSearcher();
        searchFlightTo.showFlightsTo( search, "Ber");

        FlightSearcher searchFlight = new FlightSearcher();
        searchFlight.showAvailableConnection( search, "Waw", "Ber"  );
    }
}
