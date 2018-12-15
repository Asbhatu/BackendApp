package com.lwam.lwam.model;

import java.io.Serializable;
import java.util.List;



public class UserProfileModel {

	
	private long userProfileId;

	
	
	private String dob;

	private String phoneNumber;

    private Gender gender;

	private String motherName;

	
	private String motherFatherName;
	

	private String dor;
	

	
	private List<AddressModel> addresses; 
	
	
	private List<Military> Military; 
	
	
	private List<Health> health; 
	
	
	private List<Education> education; 
	
	
	private List<Vacation> vacation; 
	

	 private Biher biher;
	 
	
	 private Department department;
	 

	 private Religion religion;
	 
	
	
    private Weapon weapon;
	
	
    private UserModel user;
	
	
	
	public List<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressModel> addresses) {
		this.addresses = addresses;
	}

	public List<Military> getMilitary() {
		return Military;
	}

	public void setMilitary(List<Military> military) {
		Military = military;
	}

	public List<Health> getHealth() {
		return health;
	}

	public void setHealth(List<Health> health) {
		this.health = health;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Vacation> getVacation() {
		return vacation;
	}

	public void setVacation(List<Vacation> vacation) {
		this.vacation = vacation;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	

	public long getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(long userProfileId) {
		this.userProfileId = userProfileId;
	}

	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherFatherName() {
		return motherFatherName;
	}

	public void setMotherFatherName(String motherFatherName) {
		this.motherFatherName = motherFatherName;
	}

	
	public String getDor() {
		return dor;
	}

	public void setDor(String dor) {
		this.dor = dor;
	}

	



	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public UserProfileModel() {
	}

	public Biher getBiher() {
		return biher;
	}

	public void setBiher(Biher biher) {
		this.biher = biher;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	public Weapon getWeapon() {
		return weapon;
	}


	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}


	
}


