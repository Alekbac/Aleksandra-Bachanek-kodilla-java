package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {

        OrderProdService orderService = new OrderProdService();
        orderService.showOrders(new OrderProdRetriever().retrieve() );
    }

}
