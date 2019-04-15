package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList ()
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        if (evenNumbers.size() > 0){
            System.out.println("Test of empty list NG");
        }else {
            System.out.println( "Test of empty list OK" );
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList ()
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(30);
        evenNumbers.add(11);
        evenNumbers.add(15);
        evenNumbers.add(2);

        for(int i = 0; i < evenNumbers.size(); i++){
            int even = evenNumbers.get(i)%2;
            if(even == 0){
                System.out.println("Even numbers from the list: " + evenNumbers.get(i));
                evenNumbers.remove(i);
            }
        }
    }
}
