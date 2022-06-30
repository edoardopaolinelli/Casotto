package com.unicam.ids2122.casotto.demo.Entity;

public class GestoreChalet extends Guest{

    protected GestoreChalet() {
        super();
    }
    public GestoreChalet(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    public GestoreChalet(String email, String password) {
        super(email, password);
    }
}