package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier {

    private List<Product> showProdList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Chia seeds", 20));
        productList.add(new Product("Quinoa seeds", 40));
        productList.add(new Product("Avocado", 10));

        return productList;
    }

    public boolean process(Supplier supplier, List<Product> productList){
        for (Product product: productList){
            if (product.prodQuantity < 15){
                System.out.println("Product: " + product.getProdName() + " is available in stock " +
                        "in a small quantity");
            }
        }
        return true;
    }

    @Override
    public String getSupplierName() {
        return null;
    }

    @Override
    public String getProdName() {
        return null;
    }

    @Override
    public int getProdQuantity() {
        return 0;
    }

    @Override
    public boolean process() {
        return false;
    }
}
