package com.lwam.lwam.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Trainee {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "trainee_id")
	private long traineeId;
	@Column(name = "dor")
	private String dor;
	@Column(name = "grade")
	private long grade;
	@Column(name = "location")
	private String location;
	
   // @OneToMany
   // @JoinColumn(name = "trainee_id")
   // private List<TraineeSupply> traineeSupply;
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
    @OneToMany(mappedBy = "trainee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<TraineeSupply> traineeSupplies;
    

    @ManyToMany(mappedBy = "trainees")
	private Set<Trainer> trainers;
   
    @ManyToMany(mappedBy = "trainees")
	private Set<Teacher> teachers;
	
	
    @ManyToMany(mappedBy = "trainees")
   	private Set<Subject> subjects;
    
    @ManyToMany(mappedBy = "trainees")
   	private Set<Training> training;
    
	
	
	public void setTraineeId(long traineeId) {
		this.traineeId = traineeId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<TraineeSupply> getTraineeSupplies() {
		return traineeSupplies;
	}

	public void setTraineeSupplies(List<TraineeSupply> traineeSupplies) {
		this.traineeSupplies = traineeSupplies;
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
    
    
    @Override
    public String toString() {
        return String.format("Trainee[traineeId=%d, grade=%d, dor='%s', location='%s']", traineeId, grade, dor, location);
    }
	

}
