package com.kodilla.good.patterns.order;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Confirmation message has been sent to User - Thank you for choosing our shop!");
    }
}
