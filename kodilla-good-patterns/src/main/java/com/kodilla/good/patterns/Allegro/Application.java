package com.kodilla.good.patterns.Allegro;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new InformationService(), new OrderService(), new OrderRepository() );
        productOrderService.process(orderRequest);
    }
}
