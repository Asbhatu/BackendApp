package com.lwam.lwam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.lwam.lwam.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	

}




 
