package com.kodilla.good.patterns.challenges;

public class DBOrderSaver implements OrderSaver{
    @Override
    public void saveOrder(OrderRequest orderRequest) {
        System.out.println("Saving request in DB ");
    }
}
