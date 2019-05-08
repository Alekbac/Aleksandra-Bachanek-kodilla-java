package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public class OrderProdService {
    public void showOrders(List<OrderProdRequest> request){
        request.stream()
                .map( o -> {
                    System.out.println("Order is in process " + o.getSupplier().getSupplierName());
                    return o.getSupplier().process( o.getSupplier(), o.getOrderRequest() );
                } )
                .forEach( p -> System.out.println("Order has been forwarded for realization." + p));
    }
}
