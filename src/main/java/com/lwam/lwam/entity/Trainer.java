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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="trainer")
public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "trainer_id")
	private long trainerId;
	@Column(name = "dos")
	private String dos;
	@Column(name = "title")
	private String title;
	@Column(name = "skill")
	private String skills;
	@Column(name = "profession")
    private String profession;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "trainer_trainee_mapping", joinColumns = @JoinColumn(name = "trainer_id", referencedColumnName = "trainer_id"), inverseJoinColumns = @JoinColumn(name = "trainee_id", referencedColumnName = "trainee_id"))
    private Set<Trainee> trainees;  
	
    //@ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "trainer_training_mapping", joinColumns = @JoinColumn(name = "trainer_Id", referencedColumnName = "trainer_Id"), inverseJoinColumns = @JoinColumn(name = "training_id", referencedColumnName = "training_id"))
    //private Set<Training> trainings;  
    
	@OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<TrainerSupply> trainerSupplies;
	
	 @ManyToMany(mappedBy = "trainers")
	 private Set<Training> trainings;
	   
	
	public long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}


	public String getDos() {
		return dos;
	}

	public void setDos(String dos) {
		this.dos = dos;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}


	protected Trainer() {}

    public Trainer(
    		    String dos,
    		    String trainings,
    		     String title,
    		     String skills,
    		     String military_info
    		) {
    	
    	
    	 this.dos = dos;
    	 this.title = title;
    	 this.skills = skills;
   
    }
    
   
    
    @Override
    public String toString() {
        return String.format(
                "Trainer[trainerId=%d, dos='%s', title='%s', skills='%s']",
                trainerId, dos, title ,skills);
    }
	

}
