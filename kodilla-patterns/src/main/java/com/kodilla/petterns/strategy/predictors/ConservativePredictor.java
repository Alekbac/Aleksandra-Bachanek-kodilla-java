package com.kodilla.petterns.strategy.predictors;

import com.kodilla.petterns.strategy.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}