package com.lwam.lwam.entity;


import java.util.Set;

import javax.persistence.*;

@Entity
public class Training {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "training_id")
    private long trainingId;
	@Column(name = "training_nme")
	private String trainingName;
	@Column(name = "training_progress")
    private String trainingProgress;
	@Column(name = "training_status")
    private String trainingStatus;
	@Column(name = "training_duration")
    private String trainingDuration;
	@Column(name = "training_activites")
    private String trainingActivites;
	@Column(name = "training_type")
    private String trainingType;
	
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "training_trainee_mapping", joinColumns = @JoinColumn(name = "training_id", referencedColumnName = "training_id"), inverseJoinColumns = @JoinColumn(name = "trainee_id", referencedColumnName = "trainee_id"))
    private Set<Trainee> trainees; 
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "training_trainee_mapping", joinColumns = @JoinColumn(name = "training_id", referencedColumnName = "training_id"), inverseJoinColumns = @JoinColumn(name = "trainer_id", referencedColumnName = "trainer_id"))
    private Set<Trainer> trainers; 
    
    
	protected Training() {}

    public Training(
    		    String trainingName,
    		    String trainingProgress,  		   
    		    String trainingStatus,
    		     String trainingDuration,
    		     String trainingActivites,
    		     String trainingType
    		   
    		) {
    	
   	
    	 this.trainingName = trainingName;
    	 this.trainingProgress = trainingProgress;
    	 this.trainingStatus = trainingStatus;
    	 this.trainingDuration = trainingDuration;
    	 this.trainingActivites = trainingActivites;
    	 this.trainingType = trainingType;
   
       
    }
    

  
    public Set<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(Set<Trainer> trainers) {
		this.trainers = trainers;
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingProgress() {
		return trainingProgress;
	}

	public void setTrainingProgress(String trainingProgress) {
		this.trainingProgress = trainingProgress;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public String getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}

	public String getTrainingActivites() {
		return trainingActivites;
	}

	public void setTrainingActivites(String trainingActivites) {
		this.trainingActivites = trainingActivites;
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}



	public String toString() {
        return String.format(
                "Teacher[trainingId=%d, trainingName=%s, trainingProgress=%s, trainingStatus=%s,  trainingDuration=%s, trainingType=%s,"
                + "]",
                trainingId, trainingName, trainingProgress, trainingStatus ,trainingDuration, trainingType
                );
    }
	

}
