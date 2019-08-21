package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FourCheesePizzaDrderDecorator extends AbstractPizzaOrderDecorator {
    public FourCheesePizzaDrderDecorator (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(18));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " four cheeses version ";
    }
}
