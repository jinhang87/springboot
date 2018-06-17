package com.example.jpamysql.User.Controller;

import com.example.jpamysql.User.Entity.User;
import com.example.jpamysql.User.Dao.UserReposity;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

//    @RequestMapping(method = RequestMethod.GET)
//    public List<User> show() {
//        return userReposity.findAll();
//    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> show(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "size", defaultValue = "10") int pageSize){
        return userReposity.findAll(new PageRequest(page, pageSize, Sort.Direction.ASC, "userId"));
    }
}
