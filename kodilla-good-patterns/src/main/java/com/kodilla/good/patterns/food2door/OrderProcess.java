package com.kodilla.good.patterns.food2door;

public interface OrderProcess {
    OrderDto process(OrderResult orderResult, OrderData orderData);
}
