package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public OrderData orderData;
    public boolean isAccepted;

    public OrderDto(OrderData orderData, boolean isAccepted) {
        this.orderData = orderData;
        this.isAccepted = isAccepted;
    }

    public OrderData getOrderData() {
        return orderData;
    }

    public boolean isAccepted() {
        return isAccepted;
    }
}
