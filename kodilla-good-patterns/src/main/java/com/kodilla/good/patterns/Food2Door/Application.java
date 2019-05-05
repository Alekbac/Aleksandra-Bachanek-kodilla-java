package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {

        OrderProdProcessor orderProcessor = new OrderProdProcessor(new OrderProdRepository());
        orderProcessor.run( supplier );

    }
}
