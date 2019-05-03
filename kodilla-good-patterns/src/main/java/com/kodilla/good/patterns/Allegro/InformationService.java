package com.kodilla.good.patterns.Allegro;

public class InformationService {
    public boolean inform(OrderRequest orderRequest) {
        System.out.println( "Dear " + orderRequest.getUser().getName() +" " +orderRequest.getUser().getSurname()
                + " " + ",your order on item: " + orderRequest.getItem() +" ,ordered: " + orderRequest.getDate() +
                " is in process!" );
        return true;
    }
}
