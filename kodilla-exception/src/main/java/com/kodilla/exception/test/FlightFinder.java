package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flyingDirection = new HashMap<>();
        flyingDirection.put( "Chicago", true );
        flyingDirection.put( "New York", true );
        flyingDirection.put( "Dallas", false );
        flyingDirection.put( "Los Angeles", false );

        String departure = flight.getDepartureAirport();
        String arrival = flight.getArrivalAirport();

        if(flyingDirection.containsKey(arrival) && (flyingDirection.containsKey(departure))){
            return (flyingDirection.get(arrival) && flyingDirection.get(departure));
        }else {
            String report;

            if (!flyingDirection.containsKey( arrival ) && !flyingDirection.containsKey( departure )) {
                report = "There isn't connection between " + departure + " and " + arrival;
            } else if (!flyingDirection.containsKey( departure )) {
                report = "The plane to " + arrival + " don't fly from " + departure;
            } else {
                report = "The plane form " + departure + " don't land in " + arrival;
            }
            throw new RouteNotFoundException(report);
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight( "Chicago", "Buenos Aires" );
        Flight flight2 = new Flight( "London", "Los Angeles" );
        Flight flight3 = new Flight( "Warsaw", "Berlin" );

        FlightFinder flightFinder = new FlightFinder();

        try {
            System.out.println( flightFinder.findFlight( flight1 ) );
        } catch (RouteNotFoundException e) {
            System.out.println( e );
        }

        try {
            System.out.println( flightFinder.findFlight( flight2 ) );
        } catch (RouteNotFoundException e) {
            System.out.println( e );
        }

        try {
            System.out.println( flightFinder.findFlight( flight3 ) );
        } catch (RouteNotFoundException e) {
            System.out.println( e );
        }
    }
}
