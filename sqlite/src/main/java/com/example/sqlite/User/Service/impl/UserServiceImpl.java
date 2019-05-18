package com.example.sqlite.User.Service.impl;

import com.example.sqlite.User.Dao.UserReposity;
import com.example.sqlite.User.Entity.User;
import com.example.sqlite.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserReposity userReposity;

    @Override
    public List<User> userList() {
        return userReposity.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userReposity.findById(id).get();
    }

    @Override
    public void save(User user) {
        userReposity.save(user);
    }

    @Override
    public void edit(User user) {
        userReposity.save(user);
    }

    @Override
    public void delete(Long id) {
        userReposity.deleteById(id);
    }
}
