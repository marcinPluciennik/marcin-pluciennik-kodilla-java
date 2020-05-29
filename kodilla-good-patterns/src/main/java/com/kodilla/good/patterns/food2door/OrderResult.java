package com.kodilla.good.patterns.food2door;

public class OrderResult {

    public boolean myOrderResult(final OrderData orderData){
        System.out.println("Order from: " + orderData.getContractor() + "\nProduct: " + orderData.getProduct() +
                "\nQuantity: " + orderData.getQuantity() + "\nSTATUS: ACCEPTED");
        return true;
    }
}
