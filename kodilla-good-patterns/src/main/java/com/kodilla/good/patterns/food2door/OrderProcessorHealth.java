package com.kodilla.good.patterns.food2door;

public class OrderProcessorHealth {
    private HealthyShopProcess healthyShopProcess;

    public OrderProcessorHealth(HealthyShopProcess healthyShopProcess) {
        this.healthyShopProcess = healthyShopProcess;
    }

    public OrderDto ordering(){
        return healthyShopProcess.process();
    }
}
