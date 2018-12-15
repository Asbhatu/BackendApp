package com.lwam.lwam.entity;

import javax.persistence.*;

@Entity
public class Marital {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "marital_id")
    private long vacationId;
    @Column(name = "date_served")
    private String dateServed;
    @Column(name = "marital_status")
    private String maritalStatus;
   
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
	private UserProfile userProfile;

  
	protected Marital() {}

    public Marital(
    		    String dateServed,
    		    String maritalStatus
    		   
    		    
    		) {
    	
    	
    	 this.dateServed = dateServed;
    	 this.maritalStatus = maritalStatus;
    	
    	 
    }
    
   
    
    
    public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
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


    @Override
    public String toString() {
        return String.format(
    	 
         "Container[vacationId=%d, dateServed=%s, maritalStatus=%s"
                + "]",
                vacationId, dateServed, maritalStatus
                );
    }
	

}
