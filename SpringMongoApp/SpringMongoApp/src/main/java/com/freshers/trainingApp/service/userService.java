package com.freshers.trainingApp.service;

import com.freshers.trainingApp.model.users;
import com.freshers.trainingApp.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepo userRepo;

    public String createUser(String uname, String password, String email){
        users user = new users(
                uname,
                password,
                email
                
        );
        userRepo.save(user);
        return ("New user created with ID: "+ user.getId());
    }

    public List<users> listUsers(){
        return userRepo.findAll();
    }
}
