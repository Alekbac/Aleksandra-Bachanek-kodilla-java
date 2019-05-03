package com.kodilla.good.patterns.Allegro;

public class OrderRepository {
    public boolean createOrder(OrderRequest orderRequest) {
        System.out.println( "Order for: " + orderRequest.getUser().getName() +" " +orderRequest.getUser().getSurname()
                + " " + ",item: " + orderRequest.getItem() + " has been sended to the repository." );
        return true;
    }
}
