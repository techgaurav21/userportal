package com.techgaurav.userportal.repository;

import com.techgaurav.userportal.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public List<User> findAll() {

        System.out.println("==========UserRepository returning all users ==============");
        //TODO - return hardcoding, get from Data store
        User user1 = new User();
        user1.setFirstName("Fnu");
        user1.setLastName("Gaurav");
        user1.setEmail("techgaurav21@gmail.com");

        User user2 = new User();
        user2.setFirstName("Fnu");
        user2.setLastName("Gaurav");
        user2.setEmail("techgaurav21@gmail.com");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        //return userRepository.findAll();
        return userList;
    }
}
