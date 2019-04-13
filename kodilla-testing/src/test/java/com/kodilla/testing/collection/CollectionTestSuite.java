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
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Test of empty list OK");
    }

    @Test
    public void testOddNumbersExterminatorNormalList ()
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(11);
        numbers.add(15);
        numbers.add(2);

        for(int i = 0; i<numbers.size(); i++){
            int even = numbers.get(i)%2;
            if(even == 0){
                System.out.println("Even numbers from list: " + numbers.get(i));
                numbers.remove(i);
            }
        }
        System.out.println("Removed odd numbers: " + numbers);
    }
}
