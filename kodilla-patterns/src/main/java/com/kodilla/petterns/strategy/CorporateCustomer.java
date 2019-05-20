package com.kodilla.petterns.strategy;
/* reprezentująca klientów korporacyjnych, skłonnych do podejmowania
jedynie umiarkowanego ryzyka inwestycyjnego*/

import com.kodilla.petterns.strategy.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
