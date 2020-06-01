package com.kodilla.good.patterns.food2door;

public class OrderProcessorExtra {
    private ExtraFoodShopProcess extraFoodShopProcess;

    public OrderProcessorExtra(ExtraFoodShopProcess extraFoodShopProcess) {
        this.extraFoodShopProcess = extraFoodShopProcess;
    }

    public OrderDto ordering(){
        return extraFoodShopProcess.process();
    }
}
