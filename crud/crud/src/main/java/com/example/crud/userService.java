package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    private userRepository userRepo;

    public String createUser(String username, String department, String manager , int age, BigInteger salary){
        user user = new user(
        		username,
        		department,
        		manager,
        		age,
        		salary
                
        );
        userRepo.save(user);
        return ("New user created with ID: "+ user.getId());
    }

    public List<user> listUsers(){
        return userRepo.findAll();
    }
    public String update(String name,String manager, String department, String id) {
		Optional<user> u = userRepo.findById(id);
		System.out.println(id);
		user user = u.get();
		System.out.println(user);
		user.setId(id);
		user.setUsername(name);
		user.setManager(manager);
        user.setDepartment(department);		
		userRepo.save(user);
		
		return("Updated");
		
	
	}

	public String deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		return (" user deleted with ID: "+ id);
	}
}
