package com.kodilla.good.patterns.Allegro;

public class OrderService {
    public boolean order(OrderRequest orderRequest) {
        System.out.println( "New order: " + orderRequest.getUser().getName() +" " +orderRequest.getUser().getSurname()
                + " " + ",item: " + orderRequest.getItem() + " " );
        return true;
    }
}
