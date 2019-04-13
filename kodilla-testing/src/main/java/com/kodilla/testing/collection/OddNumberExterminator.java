package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public void evenNumberOfList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
    }
}
