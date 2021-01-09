package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {
    private String productName;
    private String productUUID;

    public Product(String productName, String productUUID) {
        this.productName = productName;
        this.productUUID = productUUID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductUUID() {
        return productUUID;
    }
}
