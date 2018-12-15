package com.lwam.lwam.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TeacherSupply {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "teacher_supply_id")
    private long teacherSupplyId;
	@Column(name = "salary")
	private String salary;
	@Column(name = "teaching_supply")
    private String teachingSupply;
	@Column(name = "cleaning_supply")
    private String cleaningSupply;
	@Column(name = "housing_supply")
    private String housingSupply;
	
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    
   
	protected TeacherSupply() {}

    public TeacherSupply(
    		    String salary,
    		    String teachingSupply,
    		    String cleaningSupply,
    		    String housingSupply
    		    
    		) {
    	
    	
    	 this.salary = salary;
    	 this.teachingSupply = teachingSupply;
    	 this.cleaningSupply = cleaningSupply;
    	 this.housingSupply = housingSupply;
    	 
    }
    
   

    public long getTeacherSupplyId() {
		return teacherSupplyId;
	}

	public void setTeacherSupplyId(long teacherSupplyId) {
		this.teacherSupplyId = teacherSupplyId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeachingSupply() {
		return teachingSupply;
	}

	public void setTeachingSupply(String teachingSupply) {
		this.teachingSupply = teachingSupply;
	}

	public String getCleaningSupply() {
		return cleaningSupply;
	}

	public void setCleaningSupply(String cleaningSupply) {
		this.cleaningSupply = cleaningSupply;
	}

	public String getHousingSupply() {
		return housingSupply;
	}

	public void setHousingSupply(String housingSupply) {
		this.housingSupply = housingSupply;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
    public String toString() {
        return String.format(
                "Container[teacherSupplyId=%d, salary=%s, teachingSupply=%s, cleaningSupply=%s, housingSupply=%s,"
                + "]",
                teacherSupplyId, salary, teachingSupply, cleaningSupply ,housingSupply
                );
    }
	

}
