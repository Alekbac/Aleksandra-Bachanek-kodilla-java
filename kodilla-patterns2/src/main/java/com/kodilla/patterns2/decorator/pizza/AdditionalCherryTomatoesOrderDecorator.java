package com.kodilla.patterns2.decorator.pizza;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.math.BigDecimal;

public class AdditionalCherryTomatoesOrderDecorator extends AbstractPizzaOrderDecorator {
    public AdditionalCherryTomatoesOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + cherry tomatoes";
    }
}
