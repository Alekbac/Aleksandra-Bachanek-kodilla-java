package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PlasticCutleryOrderDecorator extends AbstractPizzaOrderDecorator{
    public PlasticCutleryOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(1.0));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + plastic cutlery";
    }
}
