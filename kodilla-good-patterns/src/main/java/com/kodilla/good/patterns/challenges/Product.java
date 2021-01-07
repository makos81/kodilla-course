package com.kodilla.good.patterns.challenges;

public class Product {
    private String productType;
    private int UUID;

    public Product(String productType, int UUID) {
        this.productType = productType;
        this.UUID = UUID;
    }

    public String getProductType() {
        return productType;
    }

    public int getUUID() {
        return UUID;
    }
}
