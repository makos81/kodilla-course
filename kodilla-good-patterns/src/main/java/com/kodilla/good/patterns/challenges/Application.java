package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args){
        OrderRequest orderRequest = new OrderRequest(new User("seller", "seller"), new User("buyer", "bueyer"),
                new Product("shoes", 112), 1);
        ProductOrderProcessor productOrderService = new ProductOrderProcessor(new ProductOrderService(), new MailSender(),
                new DBOrderSaver());
        productOrderService.process(orderRequest);
    }
}
