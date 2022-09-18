package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;



@Controller
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	Logger logger = LoggerFactory.getLogger(MainController.class);
    
    
    @GetMapping(value="/")
    public String showIndexPage(ModelMap model){
	         
		 return "index";
    }
    
    @PostMapping("/login")
    public String showLogin(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, ModelMap map) {
        User u = new User(name,email,password);
        userRepository.save(u); 
        
        return "success";
}
    @GetMapping("/users")
	public String showUsers(ModelMap model) {
		
		
		logger.info("Getting all Users");
		Iterable<User> users = userRepository.findAll();
		
		logger.info("Passing users to view");
	    model.addAttribute("users", users);    
		
        return "users";
    }
}
