package com.allen.odooLink2.service;

import com.allen.odooLink2.domain.User;
import com.allen.odooLink2.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void save(List<User> users) {
        userRepository.save(users);
    }
    
//    public User update(User user) {
//    	return userRepository.update(user);
//    }
}
