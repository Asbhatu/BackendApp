package com.lwam.lwam.entity;

import javax.persistence.*;


@Entity
public class Education {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "education_id")
    private long educationId;
    @Column(name = "date_served")
    private String dateServed;
    @Column(name = "education_status")
    private String educationStatus;
    @Column(name = "education_level")
    private String educationLevel;
   /*
    
    @ManyToOne
    @JoinColumn(name = "staff_supply_id")
    private Staff staff;
    */
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
	private UserProfile userProfile;
    
    
   
    
	protected Education() {}

    public Education(
    		    String dateServed,
                String educationStatus,
                String educationLevel
    		   
    		    
    		) {
    	
    	
    	 this.dateServed = dateServed;
    	 this.educationStatus = educationStatus;
    	 this.educationLevel = educationLevel;
    	   	 
    }
    
	
    @Override
    public String toString() {
        return String.format(
    	 
         "Education[educationId=%d, dateServed=%s, educationStatus=%s, educationLevel=%s"
                + "]",
                educationId, dateServed, educationStatus, educationLevel
                );
    }
	

}
