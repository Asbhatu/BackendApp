package com.lwam.lwam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lwam.lwam.model.LwamModel;
//import org.springframework.ui.Model;



@Repository
public interface LwamRepositroy extends JpaRepository<LwamModel, Long> {
	
	
	String findByFirstName(String firstName);
	

}
