package com.freshers.trainingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/users")
public class userControllers {

    @Autowired
    private com.freshers.trainingApp.service.userService userService;

    @PostMapping("/add")
    public String createUser(
            @RequestParam("username") String uname,
            @RequestParam("password") String password,
            @RequestParam("emailId") String email
          
            ) {
        return userService.createUser(uname,password,email);
    }

    @GetMapping("/list")
    public List<?> listUsers(){
        return userService.listUsers();
    }
}
