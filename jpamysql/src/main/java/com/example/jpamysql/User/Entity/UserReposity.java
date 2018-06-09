package com.example.jpamysql.User.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User, Long> {
}
