package com.lwam.lwam.model;

public class ProfileDomain {
	
	UserModel user;
	UserProfileModel userProfile;
	AddressModel  address;
	
     public ProfileDomain() {
    	 
     }
	
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public UserProfileModel getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfileModel userProfile) {
		this.userProfile = userProfile;
	}
	public AddressModel getAddress() {
		return address;
	}
	public void setAddress(AddressModel address) {
		this.address = address;
	}
	
	

}
