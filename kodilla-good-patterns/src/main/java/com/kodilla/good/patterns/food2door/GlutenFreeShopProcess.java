package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopProcess implements OrderProcess{
    OrderResult orderResult = new OrderResult();
    InputOrderGlutenFreeShop inputOrderGlutenFreeShop = new InputOrderGlutenFreeShop();
    OrderData orderData = inputOrderGlutenFreeShop.inputOrder();

    public OrderDto process(){
        orderResult.myOrderResult(orderData);

        System.out.println("DON'T WORRY YOUR ORDER WILL BE ALWAYS SHIPPED");
        System.out.println("IN THAT CASE WE NEED JUST MORE TIME");
        System.out.println("WE WILL INFORM YOU WHEN YOUR ORDER WILL BE READY");
        System.out.println("------------------------------------------------------");
        return new OrderDto(orderData, true);

    }
}
