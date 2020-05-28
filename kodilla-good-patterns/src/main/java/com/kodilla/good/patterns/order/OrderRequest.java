package com.kodilla.good.patterns.order;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private LocalDate dateOfOrder;
    private LocalDate dateOfShipping;

    public OrderRequest(User user, LocalDate dateOfOrder, LocalDate dateOfShipping) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.dateOfShipping = dateOfShipping;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public LocalDate getDateOfShipping() {
        return dateOfShipping;
    }
}
