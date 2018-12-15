package com.lwam.lwam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class LwamModel {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	int id;
	@GeneratedValue(strategy = GenerationType.AUTO)	
	
	@Column(name="first_name")
	String firstName;
	@Column(name="last_name")
	String lastName;
	@Column(name="email")
	String email;
	@Column(name="phone_number")
	long phoneNumber;
	@Column(name="country")
	String country;
	@Column(name="street")
	String street;
	@Column(name="state")
	String state;
	@Column(name="zip")
	long zip;
	@Column(name="city")
	String city;
	
	
	public LwamModel() {
	}
	
	public LwamModel(String firstName, String lastName, String email, long phoneNumber,
			String country, String street, String state, long zip, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber =  phoneNumber;
		this.country = country;
		this.city =  city;
		this.zip = zip;
		this.state  = state;
		this.street = street;
	}

	
	@Override
	public String toString() {
		return String.format("LwamModel[id=%d, firstName='%s', lastName='%s,"
				+ " email='%s, phoneNumber='%d', country='%s',"
				+ "street='%s', city='%s', zip='%d',"
				+ "state='%s']", id, firstName, lastName, email, phoneNumber, country,
				street, city, zip, state);
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
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
		

}
	
	
	
	
	
	
	


