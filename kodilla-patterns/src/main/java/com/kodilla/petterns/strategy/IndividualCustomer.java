package com.kodilla.petterns.strategy;
/* reprezentująca dojrzałych klientów, dla których najbardziej istotna jest ochrona kapitału
bez skłonności do żadnego ryzyka
inwestycyjnego, dająca niską, lecz pewną stopę zwrotu z inwestycji*/

import com.kodilla.petterns.strategy.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer{
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
