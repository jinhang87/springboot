package com.example.jwt.MyUser;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private MyUserRepository myUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/signup")
    public void sighup(@RequestBody MyUser myUser){
        myUser.setPassword(bCryptPasswordEncoder.encode(myUser.getPassword()));
        myUserRepository.save(myUser);
    }
}
