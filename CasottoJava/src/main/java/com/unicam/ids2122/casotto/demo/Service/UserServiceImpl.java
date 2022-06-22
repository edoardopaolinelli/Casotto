package com.unicam.ids2122.casotto.demo.Service;

import com.unicam.ids2122.casotto.demo.Entity.Guest;
import com.unicam.ids2122.casotto.demo.Repository.UserRepository;

import java.util.List;


public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository repository){
        this.userRepository = repository;
    }
    @Override
    public List<Guest> getAllClienti() {
        return userRepository.findAll();
    }

    @Override
    public List<Long> login(int type, String email, String password) {
        return null;
    }

    @Override
    public String logout(long token) {
        return null;
    }

    @Override
    public void signin(int type, String name, String surname, String email, String password) {

    }
}