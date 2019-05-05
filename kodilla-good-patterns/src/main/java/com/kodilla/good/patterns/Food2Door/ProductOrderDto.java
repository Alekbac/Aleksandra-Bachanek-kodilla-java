package com.kodilla.good.patterns.Food2Door;

public class ProductOrderDto {

    public String product;
    public int quantity;
    public boolean isOrdered;

    public ProductOrderDto(String product, int quantity, boolean isOrdered) {
        this.product = product;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
