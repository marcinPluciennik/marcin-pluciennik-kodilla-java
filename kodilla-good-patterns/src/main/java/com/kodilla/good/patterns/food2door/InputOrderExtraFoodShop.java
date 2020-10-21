package com.kodilla.good.patterns.food2door;

public class InputOrderExtraFoodShop {

    public OrderData inputOrder() {
        String contractor = "ExtraFoodShop";
        String product = "Apple";
        int quantity = 100;

        return new OrderData(contractor, product, quantity);
    }
}
