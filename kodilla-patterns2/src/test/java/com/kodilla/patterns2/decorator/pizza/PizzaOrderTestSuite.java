package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithTwoToppings(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalHamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalAnchoisDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(34.5), theCost);
    }

    @Test
    public void testBeconPizzaWithTwoToppings(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalHamDecorator(pizzaOrder);
        pizzaOrder = new AdditionalAnchoisDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("YOUR ORDER: Basic (Cheese & tomato pizza) bacon version + ham + anchois", description);
    }

    @Test
    public void testFourCheesePizzaWithTomatoesAndPlasticCuterly(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new FourCheesePizzaDrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCherryTomatoesOrderDecorator(pizzaOrder);
        pizzaOrder = new PlasticCutleryOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35.5), theCost);
    }

    @Test
    public void testFourCheesePizzaWithTomatoesAndPlasticCuterly2(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new FourCheesePizzaDrderDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCherryTomatoesOrderDecorator(pizzaOrder);
        pizzaOrder = new PlasticCutleryOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("YOUR ORDER: Basic (Cheese & tomato pizza) four cheeses version  + cherry tomatoes + plastic cutlery", description);
    }

}