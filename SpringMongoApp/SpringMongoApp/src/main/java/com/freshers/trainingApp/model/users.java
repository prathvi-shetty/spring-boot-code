package com.freshers.trainingApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "tusers")
public class users {
    @Id
    private String id;
    private String username;
    private String password;
    private String emailId;
    private BigInteger contactNumber;

    public users(String username, String password, String emailId) {
        this.username = username;
        this.password = password;
        this.emailId = emailId;
       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    
   
}

