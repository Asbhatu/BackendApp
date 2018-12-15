package com.lwam.lwam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.lwam.lwam.model.LwamModel;
import com.lwam.lwam.repository.LwamRepositroy;



@Service
public class LwamService {
	
	@Autowired 
	LwamRepositroy lwamRepositroy;
	
	@Autowired
    JavaMailSender emailSender;
	
	
	public List<LwamModel> getAllStudents() {
		
		
		Iterable<LwamModel> iterable;
		List<LwamModel> lists =  new ArrayList<>();
		
		iterable = lwamRepositroy.findAll();
		iterable.forEach(lists::add);
		
		
		return lists;
		
	}


	public LwamModel postStudent(LwamModel student) {
	
		
		LwamModel studentLoc = null;

		studentLoc = lwamRepositroy.save(student);
		
		if (studentLoc != null) {
			
			SimpleMailMessage message = new SimpleMailMessage(); 
			message.setTo("jisayas@gmail.com");
			message.setSubject("Good news, new Student Registered!!"); 
			message.setText("A Student, "  + student.getFirstName().toUpperCase() + "has been registered.");
			
			emailSender.send(message);
			
		}  else  {
			
			SimpleMailMessage message = new SimpleMailMessage(); 
			message.setTo("jisayas@gmail.com");
			message.setSubject("Bad news, new Student Registered!!"); 
			message.setText("A Student, "  + student.getFirstName().toUpperCase() + "can not be registered. "
					+ "Please contact her/him using his phone number: " +  String.valueOf(student.getPhoneNumber()));
			
			emailSender.send(message);
			
			
		}
		
		
		
		return studentLoc;
	}

}
