package com.kodilla.good.patterns.food2door;

public class OrderProcessorGluten {
    private GlutenFreeShopProcess glutenFreeShopProcess;

    public OrderProcessorGluten(GlutenFreeShopProcess glutenFreeShopProcess) {
        this.glutenFreeShopProcess = glutenFreeShopProcess;
    }

    public OrderDto ordering(){
        return glutenFreeShopProcess.process();
    }
}
