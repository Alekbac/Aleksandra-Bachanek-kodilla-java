package com.kodilla.patterns.builder.bigmac;

import com.kodilla.petterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void BigmacCreator(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("Onion")
                .bun("sesame bun")
                .sauce("standard")
                .ingredients("Becon")
                .burgers(2)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
