package com.lwam.lwam.entity;


import java.util.Set;

import javax.persistence.*;

@Entity
public class Subject {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "subject_id")
    private long subjectId;
	@Column(name = "subject_nme")
	private String subjectName;
	@Column(name = "subject_progress")
    private String subjectProgress;
	@Column(name = "subject_status")
    private String subjectStatus;
	@Column(name = "subject_duration")
    private String subjectDuration;
	@Column(name = "sunject_type")
    private String subjectType;
	
	   
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "subject_trainee_mapping", joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "subject_id"), inverseJoinColumns = @JoinColumn(name = "trainee_id", referencedColumnName = "trainee_id"))
    private Set<Trainee> trainees; 
  
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "subject_teacher_mapping", joinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "subject_id"), inverseJoinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"))
    private Set<Teacher> teachers; 
    
	
	protected Subject() {}

    public Subject(
    		    String subjectName,
    		    String subjectProgress,  		   
    		    String subjectStatus,
    		     String subjectDuration,
    		     String subjectType
    		   
    		) {
    	
   	
    	 this.subjectName = subjectName;
    	 this.subjectProgress = subjectProgress;
    	 this.subjectStatus = subjectStatus;
    	 this.subjectDuration = subjectDuration;
    	 this.subjectType = subjectType;
   
       
    }
    
 
    
    
    public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectProgress() {
		return subjectProgress;
	}

	public void setSubjectProgress(String subjectProgress) {
		this.subjectProgress = subjectProgress;
	}

	public String getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	public String getSubjectDuration() {
		return subjectDuration;
	}

	public void setSubjectDuration(String subjectDuration) {
		this.subjectDuration = subjectDuration;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	
	public String toString() {
        return String.format(
                "Teacher[subjectId=%d, subjectName=%s, subjectProgress=%s, subjectStatus=%s,  subjectDuration=%s, subjectType=%s,"
                + "]",
                subjectId, subjectName, subjectProgress, subjectStatus ,subjectDuration, subjectType
                );
    }
	

}
