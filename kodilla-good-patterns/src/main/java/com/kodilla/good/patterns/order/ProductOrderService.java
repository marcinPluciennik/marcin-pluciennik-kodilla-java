package com.kodilla.good.patterns.order;

public class ProductOrderService {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new GameOrderService(), new GameOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
