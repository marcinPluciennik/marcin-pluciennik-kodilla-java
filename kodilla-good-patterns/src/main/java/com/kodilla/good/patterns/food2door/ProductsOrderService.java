package com.kodilla.good.patterns.food2door;

public class ProductsOrderService {

    public static void main(String[] args){
        OrderData orderData1 = new OrderData("ExtraFoodShop", "Apple", 100);
        OrderResult orderResult1 = new OrderResult();
        ExtraFoodShopProcess extraFoodShopProcess = new ExtraFoodShopProcess();
        extraFoodShopProcess.process(orderResult1, orderData1);

        OrderData orderData2 = new OrderData("HealthyShop", "Lemon", 50);
        OrderResult orderResult2 = new OrderResult();
        HealthyShopProcess healthyShopProcess = new HealthyShopProcess();
        healthyShopProcess.process(orderResult2,orderData2);

        OrderData orderData3 = new OrderData("GlutenFreeShop", "Bread", 500);
        OrderResult orderResult3 = new OrderResult();
        GlutenFreeShopProcess glutenFreeShopProcess = new GlutenFreeShopProcess();
        glutenFreeShopProcess.process(orderResult3, orderData3);
    }
}
