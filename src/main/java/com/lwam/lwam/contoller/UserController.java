package com.lwam.lwam.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lwam.lwam.entity.User;
import com.lwam.lwam.model.LwamModel;
import com.lwam.lwam.model.ProfileDomain;
import com.lwam.lwam.model.UserModel;
import com.lwam.lwam.service.UserService;

@RestController
//@RequestMapping(path="/user")//
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@RequestMapping(value="/user",  produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<ProfileDomain> getAllUser() {
		
		
		return userService.getAllUser();
		
		
	}
	
	@GetMapping(value="/user/{id}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUser( String id) {
		
		User user = new User();
		
		//return userService.getAllUser();
		return user;
		
	}
	
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public UserModel registerUser(@RequestBody UserModel userObj) {
		
		//User user =  new User();
		
		System.out.println("I AM AT user CONTROLER POST");
		User user = new User(userObj.getFirstName(), 
				userObj.getLastName(), userObj.getEmail(), userObj.getPassword());
		 
		   return userService.postStudent(user);

	}
	
}
