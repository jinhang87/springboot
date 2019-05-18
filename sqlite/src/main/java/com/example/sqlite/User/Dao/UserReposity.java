package com.example.sqlite.User.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sqlite.User.Entity.User;

public interface UserReposity extends JpaRepository<User, Long> {
}
