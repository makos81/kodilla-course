package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Supplier {
    private String name;
    private SupplierProcessor processor;

    public Supplier(String name, SupplierProcessor processor) {
        this.name = name;
        this.processor = processor;
    }

    public String getName() {
        return name;
    }

    public void process(Product product, int quantity){
        processor.process(product,quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(name, supplier.name) &&
                Objects.equals(processor, supplier.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, processor);
    }
}
