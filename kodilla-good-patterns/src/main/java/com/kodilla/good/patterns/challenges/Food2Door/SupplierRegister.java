package com.kodilla.good.patterns.challenges.Food2Door;


public class SupplierRegister {
    private final SupplierStorage supplierStorage;

    public SupplierRegister(SupplierStorage supplierStorage) {
        this.supplierStorage = supplierStorage;
    }

    public void registerSupplier(Supplier supplier){
        supplierStorage.registerSupplier(supplier);
    }

    public Supplier getSupplier(String s){
        return supplierStorage.getSupplier(s);
    }

}
