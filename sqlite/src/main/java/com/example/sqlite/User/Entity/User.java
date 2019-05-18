package com.example.sqlite.User.Entity;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    @Column(name = "user_name")
    private String userName;


    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;
}
