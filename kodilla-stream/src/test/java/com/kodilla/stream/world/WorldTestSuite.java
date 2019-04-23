package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country europe1 = new Country( "Poland", new BigDecimal( "12596166" ) );
        Country europe2 = new Country( "Germany", new BigDecimal( "125479616" ) );
        Country europe3 = new Country( "England", new BigDecimal( "254796166" ) );

        Country asia1 = new Country( "Russia", new BigDecimal( "1254796166" ) );
        Country asia2 = new Country( "India", new BigDecimal( "12546166" ) );
        Country asia3 = new Country( "Japan", new BigDecimal( "12547966" ) );

        Country africa1 = new Country( "Egypt", new BigDecimal( "1254796166" ) );
        Country africa2 = new Country( "Sudan", new BigDecimal( "54796166" ) );
        Country africa3 = new Country( "Marocco", new BigDecimal( "12547961" ) );

        List<Country> europeList = new ArrayList<>();
        europeList.add( europe1 );
        europeList.add( europe2 );
        europeList.add( europe3 );

        List<Country> asiaList = new ArrayList<>();
        asiaList.add( asia1 );
        asiaList.add( asia2 );
        asiaList.add( asia3 );

        List<Country> africaList = new ArrayList<>();
        africaList.add( africa1 );
        africaList.add( africa2 );
        africaList.add( africa3 );

        Continent europe = new Continent( "Europe", europeList );
        Continent asia = new Continent( "Asia", asiaList );
        Continent africa = new Continent( "Africa", africaList );

        List<Continent> world = new ArrayList<>();
        world.add( europe );
        world.add( asia );
        world.add( africa );

        World everyCountry = new World( world );

        //When

        BigDecimal worldPeoplePopulacion = everyCountry.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2994902539");
        Assert.assertEquals(expectedPeopleQuantity, worldPeoplePopulacion);
    }
}
