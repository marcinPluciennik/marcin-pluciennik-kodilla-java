package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private OrderProcess shop;

    public OrderProcessor(OrderProcess shop) {
        this.shop = shop;
    }

    public OrderDto ordering() {
        return shop.process();
    }
}
