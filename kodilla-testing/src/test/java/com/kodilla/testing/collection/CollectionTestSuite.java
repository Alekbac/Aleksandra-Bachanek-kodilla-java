package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    private OddNumberExterminator exterminator;

    @Test
    public void testOddNumbersExterminatorEmptyList ()
    {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        List<Integer> emptyList = OddNumberExterminator.exterminate(oddNumbers);

        System.out.println("Test of empty list");

        Assert.assertEquals(oddNumbers, emptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList ()
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(11);
        list.add(15);
        list.add(2);

        ArrayList<Integer> evenOnly = new ArrayList<>();

        evenOnly.add(30);
        evenOnly.add(2);

        List<Integer> compareList = OddNumberExterminator.exterminate(list);

        System.out.println("Test of full list");

        Assert.assertEquals(evenOnly,compareList );
    }
}
