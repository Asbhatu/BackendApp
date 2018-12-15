package com.lwam.lwam.model;


public class Marital {
	


    private long vacationId;
 
    private String dateServed;

    private String maritalStatus;
   
  
  
	protected Marital() {}

    public Marital(
    		    String dateServed,
    		    String maritalStatus
    		   
    		    
    		) {
    	
    	
    	 this.dateServed = dateServed;
    	 this.maritalStatus = maritalStatus;
    	
    	 
    }
    
   
    
  
	public long getVacationId() {
		return vacationId;
	}

	public void setVacationId(long vacationId) {
		this.vacationId = vacationId;
	}

	public String getDateServed() {
		return dateServed;
	}

	public void setDateServed(String dateServed) {
		this.dateServed = dateServed;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}



}
