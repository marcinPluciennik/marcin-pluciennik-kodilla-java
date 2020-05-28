package com.kodilla.good.patterns.order;

public class User {
    String name;
    String surname;
    String address;
    String phone;

    public User(String name, String surname, String country, String phone) {
        this.name = name;
        this.surname = surname;
        this.address = country;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
