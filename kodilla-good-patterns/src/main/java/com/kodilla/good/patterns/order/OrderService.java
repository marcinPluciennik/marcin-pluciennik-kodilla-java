package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public interface OrderService {

    boolean order(User user, LocalDate dateOfOrder, LocalDate dateOfShipping);
}
