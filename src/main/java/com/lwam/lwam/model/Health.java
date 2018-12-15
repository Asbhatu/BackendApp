package com.lwam.lwam.model;




public class Health {
	
	
    private long healthId;
	
	private String dateServed;
 
    private String healthStatus;
   
    private String medicine;
   
 
	public long getHealthId() {
		return healthId;
	}

	public void setHealthId(long healthId) {
		this.healthId = healthId;
	}

	public String getDateServed() {
		return dateServed;
	}

	public void setDateServed(String dateServed) {
		this.dateServed = dateServed;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}




}
