package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements SupplierProcessor{
    @Override
    public boolean process(Product product, int quantity) {
        System.out.println("Inside Extra food shop, buging " + product.getProductName()
        + " quantity: " + quantity);
        return true;
    }
}
