package com.example.jpamysql.controller;

import com.example.jpamysql.User.Entity.User;
import com.example.jpamysql.User.Entity.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserReposity userReposity;

    @RequestMapping(method = RequestMethod.POST)
    public User add() {
        User user = new User();
        user.setUserId(1l);
        user.setUserName("ceshi");
        userReposity.save(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> show() {
        return userReposity.findAll();
    }
}
