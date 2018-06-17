package com.example.jpamysql.User.Dao;

import com.example.jpamysql.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User, Long> {
}
