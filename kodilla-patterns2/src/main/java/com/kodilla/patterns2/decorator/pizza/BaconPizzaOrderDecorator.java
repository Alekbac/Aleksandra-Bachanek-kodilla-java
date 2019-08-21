package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class BaconPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public BaconPizzaOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(17));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " bacon version";
    }
}
