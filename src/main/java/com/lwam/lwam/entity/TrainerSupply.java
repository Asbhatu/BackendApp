package com.lwam.lwam.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class TrainerSupply {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "trainer_supply_id")
    private long trainerSupplyId;
    @Column(name = "salary")
    private String salary;
    @Column(name = "trainingSupply")
    private String trainingSupply;
    @Column(name = "clossing_supply")
    private String clossingSupply;
    @Column(name = "housing_supply")
    private String housingSupply;
    
    
    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

	protected TrainerSupply() {}

    public TrainerSupply(
    		    String salary,
    		    String trainingSupply,
    		    String clossingSupply,
    		     String housingSupply
  
    		) {
    	
    	
    	 this.salary = salary;
    	 this.trainingSupply = trainingSupply;
    	 this.clossingSupply = clossingSupply;
    	 this.housingSupply = housingSupply;
    	 
       
    }
    
   
    
    public long getTrainerSupplyId() {
		return trainerSupplyId;
	}

	public void setTrainerSupplyId(long trainerSupplyId) {
		this.trainerSupplyId = trainerSupplyId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTrainingSupply() {
		return trainingSupply;
	}

	public void setTrainingSupply(String trainingSupply) {
		this.trainingSupply = trainingSupply;
	}

	public String getClossingSupply() {
		return clossingSupply;
	}

	public void setClossingSupply(String clossingSupply) {
		this.clossingSupply = clossingSupply;
	}

	public String getHousingSupply() {
		return housingSupply;
	}

	public void setHousingSupply(String housingSupply) {
		this.housingSupply = housingSupply;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
    public String toString() {
        return String.format(
                "TrainerSupply[trainerSupplyId=%d, salary=%s, trainingSupply=%s, clossingSupply=%s, housingSupply=%s,"
               + "]",
               trainerSupplyId, salary, trainingSupply, clossingSupply ,housingSupply);
    }
	

}
