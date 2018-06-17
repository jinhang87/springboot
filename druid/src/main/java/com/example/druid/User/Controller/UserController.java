package com.example.druid.User.Controller;

import com.example.druid.User.Dao.UserDao;
import com.example.druid.User.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserEntity> show(){
        return userDao.findAll();
    }
}
