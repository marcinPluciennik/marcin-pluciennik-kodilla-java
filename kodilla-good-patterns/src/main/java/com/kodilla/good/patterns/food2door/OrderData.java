package com.kodilla.good.patterns.food2door;

public class OrderData {
    private String contractor;
    private String product;
    private int quantity;

    public OrderData(String contractor, String product, int quantity) {
        this.contractor = contractor;
        this.product = product;
        this.quantity = quantity;
    }

    public String getContractor() {
        return contractor;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
