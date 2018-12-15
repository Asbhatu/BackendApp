package com.lwam.lwam.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Teacher {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "teacher_id")
    private long teacherId;
	@Column(name = "dos")
	private String dos;
	@Column(name = "education")
    private String education;
	@Column(name = "skills")
    private String skills;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
	
   @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "teacher_trainee_mapping", joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "trainee_id", referencedColumnName = "trainee_id"))
    private Set<Trainee> trainees;  
    
   // @ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "teacher_subjects_mapping", joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "subject_id"))
    //private Set<Subject> subjects;  
    
    @ManyToMany(mappedBy = "teachers")
   	private Set<Subject> subjects;
   	
    
	
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  	private List<TeacherSupply> teacherSupplies;
      
   // @OneToMany
    //@JoinColumn(name = "teacher_id")
    //private List<TeacherSupply> teacherSupply;
    
	    
	protected Teacher() {}

    public Teacher(
    		    String dos,	   
    		    String education,
    		     String skills
    		   
    		) {
    	
   	
    	 this.dos = dos;
    	 this.education = education;
    	 this.skills = skills;
   
       
    }
    
 
    
    public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getDos() {
		return dos;
	}

	public void setDos(String dos) {
		this.dos = dos;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	/*
	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
*/
	public List<TeacherSupply> getTeacherSupplies() {
		return teacherSupplies;
	}

	public void setTeacherSupplies(List<TeacherSupply> teacherSupplies) {
		this.teacherSupplies = teacherSupplies;
	}

	@Override
    public String toString() {
        return String.format(
                "Teacher[teacherId=%d, dos=%s, education=%s, skills=%s,"
                + "]",
                teacherId, dos, education ,skills 
                );
    }
	

}
