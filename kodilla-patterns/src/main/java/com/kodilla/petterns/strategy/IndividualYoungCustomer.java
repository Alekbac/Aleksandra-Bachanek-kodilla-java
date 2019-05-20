package com.kodilla.petterns.strategy;
/*reprezentująca indywidualnych, młodych klientów, gotowych do
agresywnego (ale i ryzykownego) inwestowania*/

import com.kodilla.petterns.strategy.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer{
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
