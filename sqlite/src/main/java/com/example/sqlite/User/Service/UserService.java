package com.example.sqlite.User.Service;

import com.example.sqlite.User.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> userList();
    public User findUserById(Long id);
    public void save(User user);
    public void edit(User user);
    public void delete(Long id);
}
