package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderProdRetriever {
    public List<OrderProdRequest> retrieve() {

        Supplier supplier = new ExtraFoodShop();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product( "Chia seeds", 5 ));

        Supplier supplier1 = new HealthyShop();
        List<Product> productList1 = new ArrayList<>();
        productList1.add(new Product( "Brown sugar", 20 ));

        Supplier supplier2 = new GlutenFreeShop();
        List<Product> productList2 = new ArrayList<>();
        productList2.add(new Product( "Gluten free beer", 0 ));

        List<OrderProdRequest> requestList = new ArrayList<>();
        requestList.add(new OrderProdRequest( supplier, productList ));
        requestList.add(new OrderProdRequest( supplier1, productList1 ));
        requestList.add(new OrderProdRequest( supplier2, productList2 ));

        return requestList;
    }
}
