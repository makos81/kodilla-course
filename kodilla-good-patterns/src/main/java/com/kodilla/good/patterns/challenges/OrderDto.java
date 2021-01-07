package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User buyer;
    private User seller;
    private boolean isOrdered;

    public OrderDto(User buyer, User seller, boolean isOrdered) {
        this.buyer = buyer;
        this.seller = seller;
        this.isOrdered = isOrdered;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
