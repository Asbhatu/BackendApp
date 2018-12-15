package com.lwam.lwam.entity;

import javax.persistence.*;

@Entity
public class Health {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "health_id")
    private long healthId;
	@Column(name = "date_served")
	private String dateServed;
    @Column(name = "health_status")
    private String healthStatus;
    @Column(name = "medicine")
    private String medicine;
   
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
	private UserProfile userProfile;

    
	protected Health() {}

    public Health(
    		     String dateServed,
    		    String healthStatus,
    		    String medicine
    		   
    		   
    		    
    		) {
    	
    	 this.dateServed = dateServed;
    	 this.medicine = medicine;
    	 this.healthStatus = healthStatus;
    	
    	
    	 
    }
    
    
    
   
    public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

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


    @Override
    public String toString() {
        return String.format(
         "Health[healthId=%d, healthStatus=%s, dateServed=%s,medicine=%s"
                + "]",
                healthId, healthStatus, dateServed, medicine
                );
    }
	

}
