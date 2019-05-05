package com.kodilla.good.patterns.Food2Door;

import java.util.List;

public class OrderProdRequest {

    private Supplier supplier;
    private List<Product> orderRequest;

    public OrderProdRequest(Supplier supplier, List<Product> orderRequest) {
        this.supplier = supplier;
        this.orderRequest = orderRequest;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getOrderRequest() {
        return orderRequest;
    }
}