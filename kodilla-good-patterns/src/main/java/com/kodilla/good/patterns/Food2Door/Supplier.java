package com.kodilla.good.patterns.Food2Door;

import java.util.List;

interface Supplier {
    String getSupplierName();
    String getProdName();
    int getProdQuantity();
    boolean process(Supplier supplier, List<Product> productList);


}
