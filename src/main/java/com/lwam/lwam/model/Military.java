package com.lwam.lwam.model;

import javax.persistence.*;


public class Military {
	
	
    private long militaryId;
   
    private String dateServed;
  
    private String militaryStatus;
   
 
	
    
   
    public long getMilitaryId() {
		return militaryId;
	}

	public void setMilitaryId(long militaryId) {
		this.militaryId = militaryId;
	}

	public String getDateServed() {
		return dateServed;
	}

	public void setDateServed(String dateServed) {
		this.dateServed = dateServed;
	}

	public String getMilitaryStatus() {
		return militaryStatus;
	}

	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
	}

	
   
	

}
