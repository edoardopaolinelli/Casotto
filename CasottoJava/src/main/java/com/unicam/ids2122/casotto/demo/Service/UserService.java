package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Guest;

import java.util.List;

public interface UserService {
    List<Guest> getAllClienti();

    List<Long> login(int type, String email, String password);

    String logout(long token);

    void signin(int type, String name, String surname, String email, String password);
}