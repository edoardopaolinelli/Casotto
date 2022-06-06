package Service;

import Entity.Guest;
import Repository.UserRepository;

import java.util.List;


public class UserServiceImpl implements UserService {

    UserRepository userRepository;




    @Override
    public List<Guest> getAllClienti() {
        return userRepository.findAll();
    }

    @Override
    public List<Long> login(int type, String email, String password) {
        return userRepository.login(type, email, password);
    }

    @Override
    public String logout(long token) {
        return null;
    }

    @Override
    public void signin(int type, String name, String surname, String email, String password) {

    }
}