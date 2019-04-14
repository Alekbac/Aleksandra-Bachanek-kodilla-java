package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public void testOddNumbersExterminatorEmptyList (){

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Test of empty Array");
    }
    public void testOddNumbersExterminatorNormalList () {
        ArrayList<Integer> numbers = new ArrayList<>();

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
