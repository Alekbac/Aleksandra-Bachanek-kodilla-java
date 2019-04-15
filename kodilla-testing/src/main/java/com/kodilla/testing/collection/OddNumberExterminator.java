package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

   ArrayList<Integer> exterminate (ArrayList<Integer> numbers){

        ArrayList<Integer> evenNumbers = new ArrayList<>();

            for (int number: evenNumbers){
                if(number % 2 == 0){
                    evenNumbers.add(number);
                }else{
                    evenNumbers.remove(number);
                }
            }
       return evenNumbers;
   }
}