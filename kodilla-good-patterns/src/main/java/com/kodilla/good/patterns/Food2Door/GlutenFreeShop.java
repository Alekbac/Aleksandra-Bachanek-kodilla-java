package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Supplier {

    private String productName;
    private int prodQuantity;
    private String supplierName;

    private List<Product> showProdList() {
        List<Product> productList = new ArrayList<>();
        productList.add( new Product( "Gluten free pasta", 20 ) );
        productList.add( new Product( "Gluten free beer", 0 ) );
        productList.add( new Product( "Coconut flour", 10 ) );

        return productList;
    }

    @Override
    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public String getProdName() {
        return productName;
    }

    @Override
    public int getProdQuantity() {
        return prodQuantity;
    }

    @Override
    public boolean process(Supplier supplier, List<Product> productList) {
        for (Product product : productList) {
            if (product.prodQuantity == 0) {
                System.out.println( "Product: " + product.getProdName() + " is out of stock" );
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
