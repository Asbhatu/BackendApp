package com.lwam.lwam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.lwam.lwam.entity.User;
import com.lwam.lwam.model.AddressModel;
import com.lwam.lwam.model.LwamModel;
import com.lwam.lwam.model.ProfileDomain;
import com.lwam.lwam.model.UserModel;
import com.lwam.lwam.model.UserProfileModel;
import com.lwam.lwam.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository userRepository;
	
	
	public UserService() {
		
	}
	
	
	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;	
	}
	
	
	
	public List<ProfileDomain> getAllUser() {
		
		
		//List<User> userLists = new ArrayList<>();
		
		List<ProfileDomain> userLists = new ArrayList<>();
		
		Iterable<User> ites =  userRepository.findAll();
		
		
		 for (User ite:ites) 	  
		{ 
		 
			 ProfileDomain userProfileList = new ProfileDomain();
			 UserModel userModle = new UserModel();
			 AddressModel  address= new AddressModel();
			 UserProfileModel userProfile = new UserProfileModel();
			 userModle.setEmail(ite.getEmail());
			 userModle.setFirstName(ite.getFirstName());
			 userModle.setLastName(ite.getLastName());
			 userModle.setPassword(ite.getPassword());
			// address.setZoba(ite.getUserProfile().getAddresses().get(0).getZoba());
			 userProfileList.setUser(userModle);
			 userProfileList.setAddress(address);
			 userProfileList.setUserProfile(userProfile);
			 userLists.add(userProfileList);
		      
		} 
		
		//ites.forEach(userLists::add);
		
		return userLists;
	}
	
	
	
	public List<ProfileDomain> getAllUserProfiles() {
		
		
		List<ProfileDomain> userProfileLists = new ArrayList<>();
		
		Iterable<User> ites =  userRepository.findAll();
		 
		
		//ites.forEach(userLists::add);
		
		
		
		return userProfileLists;
	}
	
	
	
	
	
	public UserModel postStudent(User user) {
	
		
		//UserModel userObj =  new UserModel();
		User userLoc =  null;
		user = userRepository.save(user);
		
		UserModel userObj = new UserModel(user.getFirstName(), 
				user.getLastName(), user.getEmail(), "junkjunk");
		 
		
		return userObj;
	}


}
