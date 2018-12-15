package com.lwam.lwam.entity;

import javax.persistence.*;

@Entity
public class Military {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "military_id")
    private long militaryId;
    @Column(name = "date_served")
    private String dateServed;
    @Column(name = "military_status")
    private String militaryStatus;
   
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
	private UserProfile userProfile;
	
	protected Military() {}

    public Military(
    		    String dateServed,
    		    String militaryStatus
    		   
    		    
    		) {
    	
    	
    	 this.dateServed = dateServed;
    	 this.militaryStatus = militaryStatus;
    	
    	 
    }
    
    
   
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

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}


    @Override
    public String toString() {
        return String.format(
    	 
         "Container[militaryId=%d, dateServed=%s, militaryStatus=%s"
                + "]",
                militaryId, dateServed, militaryStatus
                );
    }
	

}
