package com.kodilla.good.patterns.food2door;

public class InputOrderGlutenFreeShop {

    public OrderData inputOrder() {
        String contractor = "GlutenFreeShop";
        String product = "Bread";
        int quantity = 500;

        return new OrderData(contractor, product, quantity);
    }
}
