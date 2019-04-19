package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

   public static List<Integer> exterminate(List<Integer> numbers){

        ArrayList<Integer> oddNumbers = new ArrayList<>();

            for (int number: numbers){
                if(number % 2 == 0){
                    oddNumbers.add(number);
                }
            }
       return oddNumbers;
   }
}