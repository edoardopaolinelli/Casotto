package com.unicam.ids2122.casotto.demo.Entity;

public class Cliente extends Guest{
    protected Cliente() {
        super();
    }

    public Cliente(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    public Cliente(String email, String password) {
        super(email, password);
    }
}