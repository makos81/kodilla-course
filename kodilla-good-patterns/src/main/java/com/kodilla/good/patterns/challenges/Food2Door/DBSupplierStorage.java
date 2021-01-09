package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class DBSupplierStorage implements SupplierStorage{
    private Map<String, Supplier> supplierMap;

    public DBSupplierStorage() {
        this.supplierMap = new HashMap<>();
    }

    @Override
    public void registerSupplier(Supplier s) {
        System.out.println("Registering supplier " + s.getName());
        supplierMap.put(s.getName(),s);
    }

    @Override
    public Supplier getSupplier(String s) {
        return supplierMap.get(s);
    }
}
