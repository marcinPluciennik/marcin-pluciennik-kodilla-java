package com.kodilla.good.patterns.food2door;

public class ProductsOrderService {

    public static void main(String[] args){

        OrderProcessor orderProcessorExtra = new OrderProcessor(new ExtraFoodShopProcess());
        orderProcessorExtra.ordering();

        OrderProcessor orderProcessorHealth = new OrderProcessor(new HealthyShopProcess());
        orderProcessorHealth.ordering();

        OrderProcessor orderProcessorGluten = new OrderProcessor(new GlutenFreeShopProcess());
        orderProcessorGluten.ordering();
    }
}
