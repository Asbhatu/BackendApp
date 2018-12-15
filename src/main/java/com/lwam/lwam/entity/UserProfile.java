package com.lwam.lwam.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//import com.lwam.lwam.model.Gender;

import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@Table(name = "user_profile")
public class UserProfile implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_profile_id")
	private long userProfileId;

	
	@Column(name = "dob")
	private String dob;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;
	
	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "mother_father_name")
	private String motherFatherName;
	
	
	@Column(name = "dor")
	private String dor;
	

	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Address> addresses; 
	
	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Military> Military; 
	
	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Health> health; 
	
	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Education> education; 
	
	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Vacation> vacation; 
	
	/*
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "userProfile")	
    private Biher biher;
	*/
	 @ManyToOne
	 @JoinColumn(name = "biher_id")
	 private Biher biher;
	 
	 @ManyToOne
	 @JoinColumn(name = "department_id")
	 private Department department;
	 
	 @ManyToOne
	 @JoinColumn(name = "religion_id")
	 private Religion religion;
	 
	
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "userProfile")
	
    private Weapon weapon;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
	public UserProfile(String biher, String phoneNumber, Gender gender,String motherName, String motherFatherName, 
			 String dob, String dor) {
		this.phoneNumber = phoneNumber;	
		this.gender = gender;
		this.motherName = motherName;
		this.motherFatherName = motherFatherName;
		this.dob = dob;
		this.dor = dor;
		
	}
	
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
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

	



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserProfile() {
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


	@Override
	public String toString() {
		return String.format("UserProfile[userProfileId=%d,  phoneNumber='%s, motherName='%s', motherFatherName='%s',"
				+ "dob='%s', dor='%s, ]", userProfileId, phoneNumber, motherName, motherFatherName,
				 dob, dor);
	}
}


