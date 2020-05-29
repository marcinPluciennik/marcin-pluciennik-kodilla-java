package com.kodilla.good.patterns.food2door;

public class HealthyShopProcess implements OrderProcess{
    private final int  QUANTITY_ON_STOCK = 100;

    public OrderDto process(OrderResult orderResult, OrderData orderData){
        orderResult.myOrderResult(orderData);

        int productsQuantity = orderData.getQuantity();

        if (productsQuantity < QUANTITY_ON_STOCK){
            System.out.println("CORRECT - WE WILL SEND YOUR ORDER TODAY");
            System.out.println("------------------------------------------------------");
            return new OrderDto(orderData, true);
        }else {
            System.out.println("WE ARE SORRY, BUT THERE IS NO ENOUGH QUANTITY ON OUR STOCK");
            System.out.println("------------------------------------------------------");
            return new OrderDto(orderData, false);
        }
    }
}
