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
}