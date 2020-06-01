package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopProcess implements OrderProcess{
    OrderResult orderResult = new OrderResult();
    InputOrderExtraFoodShop inputOrderExtraFoodShop = new InputOrderExtraFoodShop();
    OrderData orderData = inputOrderExtraFoodShop.inputOrder();

    public OrderDto process(){
        boolean isAccepted = orderResult.myOrderResult(orderData);

        if (isAccepted){
            System.out.println("EVERYTHING OK, ORDER WILL BE SHIPPED SOON, THANK YOU");
            System.out.println("------------------------------------------------------");
            return new OrderDto(orderData, true);
        }else{
            System.out.println("WE ARE SORRY, ORDER WON'T BE SHIPPED");
            System.out.println("------------------------------------------------------");
            return new OrderDto(orderData, false);
        }
    }
}
