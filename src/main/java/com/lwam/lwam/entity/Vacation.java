package com.lwam.lwam.entity;

import javax.persistence.*;

@Entity
public class Vacation {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vacation_id")
    private long vacationId;
    @Column(name = "vacation_served")
    private String dateServed;
    @Column(name = "vacation_status")
    private String vacationStatus;
  
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
	private UserProfile userProfile;
    
    
	protected Vacation() {}

    public Vacation(
    		    String dateServed,
    		    String vacationStatus   
    		    
    		) {
    	
    	
    	 this.dateServed = dateServed;
    	 this.vacationStatus = vacationStatus;
    	
    	 
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

	public String getVacationStatus() {
		return vacationStatus;
	}

	public void setVacationStatus(String vacationStatus) {
		this.vacationStatus = vacationStatus;
	}


 
    
    @Override
    public String toString() {
        return String.format(
    	 
         "Container[vacationId=%d, dateServed=%s, vacationStatus=%s"
                + "]",
                vacationId, dateServed, vacationStatus
                );
    }
	

}
