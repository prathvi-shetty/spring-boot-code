package com.example.springwebApplicationjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springwebApplicationjpa.dao.PhoneRepo;
import com.example.springwebApplicationjpa.model.Phone;

@RestController
public class PhoneController {
	@Autowired
	PhoneRepo repo;
	
	@RequestMapping("")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addphone") 
	public String addphone(Phone phone) {
		repo.save(phone);
		return "home.jsp";
	}
	@RequestMapping("/deleteid/{pid}")
	public String deleteid(@PathVariable int pid) {
		
		repo.deleteById(pid);
		return "home.jsp";
		
	}
	@RequestMapping("/getphone")
	public ModelAndView getphone(@RequestParam int pid) {
		
		ModelAndView mv = new ModelAndView("showphone.jsp");
		Phone phone = repo.findById(pid).orElse(null);
		mv.addObject(phone);
		System.out.println(phone.getPid());
		System.out.println(repo.findBySim("airtel"));
		System.out.println(repo.findBySimSorted("airtel"));
		return mv;
		
		
	}
	@PostMapping("/phone")
	public Phone phone(Phone phone) {
		repo.save(phone);
		return phone;
		
	}
	@RequestMapping("/phone/{pid}")
	@ResponseBody
	public void deletephone(@PathVariable int pid) {
		Phone p = repo.getOne(pid);
		System.out.println("object returned");
		repo.delete(p);
		
	}
	@RequestMapping("/update")
	public String update(Phone phone) {
		repo.save(phone);
		return "home.jsp";
	}
	// Rest tuto
	@RequestMapping("/phones")
	@ResponseBody
	public List<Phone> getphones() {
		return repo.findAll();
	}
	@PutMapping("/phone")
	public  Phone updatephone(Phone phone) {
		repo.save(phone);
		return phone;
	}
	
	
	/*@RequestMapping("/phone/{pid}")
	@ResponseBody
	public Optional<Phone> getphoneById(@PathVariable("pid") int pid) {
		return repo.findById(pid);
				
				
		
	}*/
	
	
	
		
	

}
