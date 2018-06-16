package com.example.redis.User.Jpa;

import com.example.redis.User.Domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpa extends JpaRepository<UserDomain, Long> {

}
