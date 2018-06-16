package com.example.redis.User.Service;

import com.example.redis.User.Domain.UserDomain;
import com.example.redis.User.Jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "user")
public class UserService {
    @Autowired
    private UserJpa userJpa;

    @Cacheable
    public List<UserDomain> list() {
        return userJpa.findAll();
    }

    public UserDomain add() {
        UserDomain user = new UserDomain();
        user.setName("呜呜");
        user.setAge(22);
        user.setPwd("mima");
        user.setAddress("三里屯");
        return user;
    }
}
