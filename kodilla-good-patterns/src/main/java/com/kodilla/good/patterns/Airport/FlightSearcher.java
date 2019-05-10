package com.kodilla.good.patterns.Airport;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    public void showFlightsFrom(Set<Airports> listOfFlights, String departureCity){
        listOfFlights.stream()
                .filter(f ->f.getDepartureCity().equals( departureCity ))
                .forEach(s -> System.out.println(s) );
    }

    public void showFlightsTo(Set<Airports> listOfFlights, String arrivalCity){
        listOfFlights.stream()
                .filter(f ->f.getArrivalCity().equals( arrivalCity ))
                .forEach( s -> System.out.println(s) );
    }

    public void showAvailableConnection(Set<Airports> listOfFlights, String departureCity, String arrivalCity){
        Set<Airports> firstFilter = listOfFlights.stream()
                .filter( f ->f.getDepartureCity().equals( departureCity ) )
                .collect( Collectors.toSet());
        Set<Airports> secondFilter = listOfFlights.stream()
                .filter( f ->f.getArrivalCity().equals( arrivalCity ) )
                .collect( Collectors.toSet());

        for(Airports first : firstFilter){
            for(Airports second : secondFilter){
                if(first.getArrivalCity().equals( second.getDepartureCity() )){
                    System.out.println(first + " " + second);
                }
            }
        }
    }
}
