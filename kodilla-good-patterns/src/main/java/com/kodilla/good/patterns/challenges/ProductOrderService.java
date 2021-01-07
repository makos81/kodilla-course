package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("ordering from " + orderRequest.getSeller().getFirstName()
                + " ordering for " + orderRequest.getBuyer().getFirstName() + " product: "
                + orderRequest.getProduct().getProductType());
        return true;
    }
}
