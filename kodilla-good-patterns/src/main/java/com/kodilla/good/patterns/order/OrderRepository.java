package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder(User user, LocalDate dateOfOrder, LocalDate dateOfShipping);
}
