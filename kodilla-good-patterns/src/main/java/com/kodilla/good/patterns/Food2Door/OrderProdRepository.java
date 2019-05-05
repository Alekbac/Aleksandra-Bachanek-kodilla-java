package com.kodilla.good.patterns.Food2Door;

public class OrderProdRepository {
    public boolean createOrder(String supplierName, String prodName, int prodQuantity){
        System.out.println("Supplier: " + supplierName + " ,product: " + prodName
        + " ,product quantity: " + prodQuantity);
        return true;
    }
}
