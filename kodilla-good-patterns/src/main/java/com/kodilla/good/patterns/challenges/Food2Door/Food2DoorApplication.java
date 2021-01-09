package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2DoorApplication {
    public static void main(String[] args){
        SupplierRegister supplierRegister = new SupplierRegister(new DBSupplierStorage());
        supplierRegister.registerSupplier(new Supplier("ExtraFoodShop", new ExtraFoodShop()));
        supplierRegister.registerSupplier(new Supplier("HealthyShop", new ExtraFoodShop()));

        supplierRegister.getSupplier("ExtraFoodShop").process(new Product("Tomatoes","1"),1);
        supplierRegister.getSupplier("HealthyShop").process(new Product("hummus","10H"),10);
    }
}
