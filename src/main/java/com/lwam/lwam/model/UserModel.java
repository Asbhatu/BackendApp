package com.lwam.lwam.model;



public class UserModel {

	
	private long userId;

	
	private String firstName;

	private String lastName;

	private String email;

	private String password;
	
	
	public UserModel() {
		
	}
	
	public UserModel(String firstName, String lastName, String email, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password =  password;
	
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return String.format("UserModel[firstName='%s', lastName='%s,"
				+ " email='%s, password='%s']", firstName, lastName, email, password);
	}
	
}

