package com.example.sqlite.User.Controller;

import com.example.sqlite.User.Dao.UserReposity;
import com.example.sqlite.User.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserReposity userReposity;

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> show(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "size", defaultValue = "10") int pageSize){
        return userReposity.findAll(new PageRequest(page,pageSize, Sort.Direction.ASC, "userId"));
    }
}
