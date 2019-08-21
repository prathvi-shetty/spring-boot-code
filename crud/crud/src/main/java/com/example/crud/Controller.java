package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {

    @Autowired
    private com.example.crud.userService userService;

    @PostMapping("/add")
    public String createUser(
            @RequestParam("username") String uname,
           
            @RequestParam("department") String department,
            @RequestParam("manager") String manager,
            @RequestParam("age") int age,
            @RequestParam("salary") BigInteger salary
          
            ) {
        return userService.createUser(uname,department,manager,age,salary);
    }

    @GetMapping("/list")
    public List listUsers(){
        return userService.listUsers();
    	
    }
    @PutMapping("/{id}")
    public String updateUsers(
    	@RequestParam("username") String uname,
        @RequestParam("department") String department,
        @RequestParam("manager") String manager, @PathVariable String id) {
    	
    	return userService.update(uname,manager,department,id);
    	
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
    	return userService.deleteUser(id);
    	
    }
    
}
