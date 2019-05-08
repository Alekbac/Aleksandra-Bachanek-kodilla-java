package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier {

    private String productName;
    private int prodQuantity;
    private String supplierName;

    private List<Product> showProdList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Chia seeds", 20));
        productList.add(new Product("Quinoa seeds", 40));
        productList.add(new Product("Avocado", 10));

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

    public boolean process(Supplier supplier, List<Product> productList) {
        for (Product product: productList){
            if (product.prodQuantity < 15){
                System.out.println("Product: " + product.getProdName() + " is available in stock " +
                        "in a small quantity");
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
