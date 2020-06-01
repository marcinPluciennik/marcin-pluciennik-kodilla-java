package com.kodilla.good.patterns.food2door;

public class ProductsOrderService {

    public static void main(String[] args){

        OrderProcessorExtra orderProcessorExtra = new OrderProcessorExtra(new ExtraFoodShopProcess());
        orderProcessorExtra.ordering();

        OrderProcessorHealth orderProcessorHealth = new OrderProcessorHealth(new HealthyShopProcess());
        orderProcessorHealth.ordering();

        OrderProcessorGluten orderProcessorGluten = new OrderProcessorGluten(new GlutenFreeShopProcess());
        orderProcessorGluten.ordering();
    }
}
