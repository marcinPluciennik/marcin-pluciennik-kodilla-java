package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Donald", "Trump", "USA", "123-123-123");
        LocalDate orderDate = LocalDate.of(2020, 6, 1);
        LocalDate shippingDate = LocalDate.of(2020, 6, 2);

        return new OrderRequest(user, orderDate, shippingDate);
    }
}
