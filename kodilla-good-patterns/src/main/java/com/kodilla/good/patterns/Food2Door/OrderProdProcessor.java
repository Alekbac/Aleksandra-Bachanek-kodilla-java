package com.kodilla.good.patterns.Food2Door;

public class OrderProdProcessor {
    private OrderProdRepository orderRepository;

    public OrderProdProcessor(OrderProdRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ProductOrderDto run(final Supplier supplier){
        boolean isOrdered = supplier.process();

        if(isOrdered){
            System.out.println("Order is in process.");
            orderRepository.createOrder(supplier.getSupplierName(), supplier.getProdName(), supplier.getProdQuantity());
            return new ProductOrderDto(supplier.getSupplierName(), supplier.getProdQuantity(), true);
        }else{
            System.out.println("Order isn't in process.");
            return new ProductOrderDto(supplier.getSupplierName(), supplier.getProdQuantity(), false);
        }
    }
}
