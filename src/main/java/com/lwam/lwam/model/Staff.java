package com.lwam.lwam.model;


import java.util.List;

import javax.persistence.*;


public class Staff {
	

    private long StaffId;
   
    private String staffDos;
  
    private String staffEducation;

    private String staffProfession;

    private String staffPosition;
   
    private String staffResponsibility;
 
    private String staffTitle;
    
    
    public long getStaffId() {
		return StaffId;
	}

	public void setStaffId(long staffId) {
		StaffId = staffId;
	}

	public String getStaffDos() {
		return staffDos;
	}

	public void setStaffDos(String staffDos) {
		this.staffDos = staffDos;
	}

	public String getStaffEducation() {
		return staffEducation;
	}

	public void setStaffEducation(String staffEducation) {
		this.staffEducation = staffEducation;
	}

	public String getStaffProfession() {
		return staffProfession;
	}

	public void setStaffProfession(String staffProfession) {
		this.staffProfession = staffProfession;
	}

	public String getStaffPosition() {
		return staffPosition;
	}

	public void setStaffPosition(String staffPosition) {
		this.staffPosition = staffPosition;
	}

	public String getStaffResponsibility() {
		return staffResponsibility;
	}

	public void setStaffResponsibility(String staffResponsibility) {
		this.staffResponsibility = staffResponsibility;
	}

	public String getStaffTitle() {
		return staffTitle;
	}

	public void setStaffTitle(String staffTitle) {
		this.staffTitle = staffTitle;
	}

	
}
