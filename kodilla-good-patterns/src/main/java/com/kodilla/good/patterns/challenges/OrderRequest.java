package com.kodilla.good.patterns.challenges;

public class OrderRequest{
    User seller;
    User buyer;
    Product product;
    int quantity;

    public OrderRequest(User seller, User buyer, Product product, int quantity) {
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
