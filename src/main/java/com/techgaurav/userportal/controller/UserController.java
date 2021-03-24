package com.techgaurav.userportal.controller;

import com.techgaurav.userportal.model.User;
import com.techgaurav.userportal.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
  This is our Controller class, which is a REST service
  and invokes our Business Service
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
