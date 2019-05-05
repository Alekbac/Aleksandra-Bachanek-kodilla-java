package com.kodilla.good.patterns.Food2Door;

public class Product {
    public String prodName;
    public int prodQuantity;

    public Product(String prodName, int prodQuantity) {
        this.prodName = prodName;
        this.prodQuantity = prodQuantity;
    }

    public String getProdName() {
        return prodName;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }
}
