package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSUite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int [20];
        double sum = 0;
        Random random = new Random();

        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = random.nextInt(5);
            sum += numbers[i];
        }
        //When
        double expected = sum /numbers.length;
        double actual = ArrayOperations.getAverage( numbers );

        //Then

        Assert.assertEquals(expected, actual, 0.0);
    }
}
