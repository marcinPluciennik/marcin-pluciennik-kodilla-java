package com.kodilla.good.patterns.food2door;

public class InputHealthyShop {

    public OrderData inputOrder() {
        String contractor = "HealthyShop";
        String product = "Lemon";
        int quantity = 50;

        return new OrderData(contractor, product, quantity);
    }
}
