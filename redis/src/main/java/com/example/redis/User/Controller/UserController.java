package com.example.redis.User.Controller;

import com.example.redis.User.Domain.UserDomain;
import com.example.redis.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<UserDomain> list() {
        return userService.list();
    }
}
