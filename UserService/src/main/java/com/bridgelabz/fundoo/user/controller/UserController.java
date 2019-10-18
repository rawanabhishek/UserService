/******************************************************************************
 
 *  Purpose:  
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   18-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.fundoo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.user.model.User;

import com.bridgelabz.fundoo.user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	

	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/login")
	public String userLogin(@RequestBody User user) {
		String email=user.getEmail();
		String password=user.getPassword();
		
		if(userService.userLogin(email ,password)) {
			return "login successful";
		}else {
		return "Login Failed";
		
		}
	}
	
	@PostMapping("/register")
	public boolean userRegister(@RequestBody User user) {
		
		return userService.userRegister(user);
	}
	
	
	
	
	

}
