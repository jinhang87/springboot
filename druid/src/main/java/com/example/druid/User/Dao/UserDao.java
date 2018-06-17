package com.example.druid.User.Dao;

import com.example.druid.User.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity, Long> {
}
