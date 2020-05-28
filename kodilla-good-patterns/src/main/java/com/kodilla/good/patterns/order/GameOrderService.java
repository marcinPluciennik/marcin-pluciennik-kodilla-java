package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class GameOrderService implements OrderService {

    public boolean order(final User user, final LocalDate gameOrderDate, final LocalDate gameShippingDate) {
        System.out.println("Order to: " + user.getName() + " " + user.getSurname() + "\nShipping address: " + user.getAddress() +
                "\nPhone: " + user.getPhone() + "\nDate of order: " + gameOrderDate.toString()
                + "\nDate of shipping: " + gameShippingDate);
        return true;
    }
}
