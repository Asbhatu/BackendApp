package com.lwam.lwam.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lwam.lwam.model.LwamModel;
import com.lwam.lwam.model.UserModel;
import com.lwam.lwam.service.LwamService;



@RestController
public class LwamController {
	
	@Autowired 
	LwamService lwamService;

	@RequestMapping(value="/student", method = RequestMethod.GET)
	public List<LwamModel> getAll() {
		
		System.out.println("I AM AT CONTROLER GET");
	
		 
		   return lwamService.getAllStudents();
		
	}
	

	

	@RequestMapping(value="/register1", method = RequestMethod.POST)
	public LwamModel registerStudent(@RequestBody LwamModel student) {
		
		LwamModel lwamModel =  new LwamModel();
		
		System.out.println("I AM AT CONTROLER POST");
		LwamModel studentLoc = new LwamModel(student.getFirstName(), 
				student.getLastName(), student.getEmail(), student.getPhoneNumber(), 
				student.getCountry(), student.getStreet(),student.getState(), 
				student.getZip(), student.getCity());
		 
		   return lwamService.postStudent(studentLoc);

	}
	
	
	
	
}
