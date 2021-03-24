package com.techgaurav.userportal.service;

import com.techgaurav.userportal.model.User;
import com.techgaurav.userportal.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
  This is our Service class, which is a annotated as @Service
  @Service allows it to be injected as dependency in other classes
  This invokes DAO layer
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /*@Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    public List<User> getAllUsers() {
        System.out.println("==========Invoking DAO layer ==============");
        // do some operations
        return userRepository.findAll();
    }
}
