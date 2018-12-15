package com.lwam.lwam.model;

import java.util.List;
import java.util.Set;





public class Trainee {
	
	
	private long traineeId;
	
	private String dor;

	private long grade;
	
	private String location;
	
  

	
	
	public void setTraineeId(long traineeId) {
		this.traineeId = traineeId;
	}


	public long getTraineeId() {
		return traineeId;
	}

	public String getDor() {
		return dor;
	}

	public void setDor(String dor) {
		this.dor = dor;
	}

	public long getGrade() {
		return grade;
	}

	public void setGrade(long grade) {
		this.grade = grade;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	protected Trainee() {}

    public Trainee(
    		    String dor,
    		    long grade,
    		     String location
    		) {
    	
    	
    	 this.dor = dor;
    	 this.grade = grade;
    	 this.location = location;
 
       
    }
    
  

}
