package com.lwam.lwam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "address")
public class Address {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "address_id")
    private long addressId;
	@Column(name = "zoba")
    private String zoba;
	@Column(name = "sub_zoba")
    private String subZoba;
	@Column(name = "mimihidar")
    private String mimihidar;
	@Column(name = "village_address")
    private String villageAddress;
	@Enumerated(EnumType.STRING)
    @Column(length = 10)
    private AddressType addressType;
	
	
	@ManyToOne
    @JoinColumn(name = "user_profile_id")
	private UserProfile userProfile;
	
	public Address() {
		
	}
	
	public Address(String zoba, String subZoba, String mimihidar, String villageAddress,
			AddressType addressType) {
		this.subZoba = subZoba;
		this.mimihidar = mimihidar;
		this.villageAddress = villageAddress;
		this.addressType = addressType;
	}
    
	
	
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public long getAddressId() {
		return addressId;
	}



	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}



	public String getZoba() {
		return zoba;
	}



	public void setZoba(String zoba) {
		this.zoba = zoba;
	}



	public String getSubZoba() {
		return subZoba;
	}



	public void setSubZoba(String subZoba) {
		this.subZoba = subZoba;
	}



	public String getMimihidar() {
		return mimihidar;
	}



	public void setMimihidar(String mimihidar) {
		this.mimihidar = mimihidar;
	}



	public String getVillageAddress() {
		return villageAddress;
	}



	public void setVillageAddress(String villageAddress) {
		this.villageAddress = villageAddress;
	}



	public AddressType getAddressType() {
		return addressType;
	}



	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}



	@Override
	public String toString() {
		return String.format("Address[addressId=%d,  zoba='%s, subZoba='%s', mimihidar='%s',"
				+ "villageAddress='%s', addressType='%s ]", addressId, zoba, subZoba, mimihidar,
				villageAddress, addressType.toString());
	}
 
    
	
	
	
    
}
