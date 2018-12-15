package com.lwam.lwam.model;




public class AddressModel {

	
    private long addressId;

    private String zoba;

    private String subZoba;
	
    private String mimihidar;
	
    private String villageAddress;

    private AddressType addressType;
	
	
    public AddressModel() {
    	
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



	
}
