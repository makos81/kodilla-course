package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements SupplierProcessor{
    @Override
    public boolean process(Product product, int quantity) {
        System.out.println("Inside Extra Healthy shot, buying " + product.getProductName()
                + " quantity: " + quantity);
        return true;
    }
}
