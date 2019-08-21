package com.example.crud;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "tusers")
public class user {
    @Id
    private String id;
    private String username;
    private String department;
    private String manager;
    private BigInteger salary;
    private int age;

    public user(String username, String department, String manager , int age, BigInteger salary) {
        this.username = username;
        this.department = department;
        this.manager = manager;
        this.age = age;
        this.salary = salary;
       
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
    public void setDepartment(String department) {
    	this.department= department;
    }

    public String getDepartment() {
        return department;
    }
    public String getManager() {
        return manager;
    }
    public void setUsername(String username) {
        this.username = username;
    }

   

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(BigInteger salary) {
    	this.salary= salary;
    }
    public BigInteger getSalary() {
    	return this.salary;
    }
    

    
   
}

