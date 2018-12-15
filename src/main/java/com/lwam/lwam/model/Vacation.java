package com.lwam.lwam.model;




public class Vacation {
	

    private long vacationId;
  
    private String dateServed;
  
    private String vacationStatus;
 
    
   
      
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

	public String getVacationStatus() {
		return vacationStatus;
	}

	public void setVacationStatus(String vacationStatus) {
		this.vacationStatus = vacationStatus;
	}


}
