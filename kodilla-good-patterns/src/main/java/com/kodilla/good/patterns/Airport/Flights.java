package com.kodilla.good.patterns.Airport;

import java.util.HashSet;
import java.util.Set;

public class Flights {

    private Set<Airports> listOfFlights = new HashSet<>();

    public Flights() {
        listOfFlights.add (new Airports( "Waw", "Ber") );
        listOfFlights.add (new Airports( "Hag", "Ber" ) );
        listOfFlights.add (new Airports( "Waw", "Krk") );
        listOfFlights.add (new Airports( "Krk", "Szcz") );
        listOfFlights.add (new Airports( "Krk", "Ber") );
        listOfFlights.add (new Airports( "Poz", "Krk" ) );
    }

    public Set<Airports> getListOfFlights() {
        return new HashSet<>( listOfFlights );
    }
}
