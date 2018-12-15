package com.lwam.lwam.entity;


import java.util.List;

import javax.persistence.*;

@Entity
public class Staff {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "staff_id")
    private long StaffId;
    @Column(name = "staff_dos")
    private String staffDos;
    @Column(name = "staff_education")
    private String staffEducation;
    @Column(name = "staff_profession")
    private String staffProfession;
    @Column(name = "staff_position")
    private String staffPosition;
    @Column(name = "staff_responsibility")
    private String staffResponsibility;
    @Column(name = "staff_title")
    private String staffTitle;
    
    

	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	

    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StaffSupply> StaffSupplies;
    
	protected Staff() {}

    public Staff(
    		    String staffDos,
    		    String staffEducation,  		   
    		    String staffProfession,
                 String staffPosition,
                 String staffResponsibility,
                 String staffTitle
    		   
    		) {
    	
   	
    	 this.staffDos = staffDos;
    	 this.staffEducation = staffEducation;
    	 this.staffProfession = staffProfession;
         this.staffPosition = staffPosition;
         this.staffResponsibility = staffResponsibility;
    	 this.staffTitle = staffTitle;
    	
       
    }
    
   
    

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<StaffSupply> getStaffSupplies() {
		return StaffSupplies;
	}

	public void setStaffSupplies(List<StaffSupply> staffSupplies) {
		StaffSupplies = staffSupplies;
	}

	@Override
    public String toString() {
        return String.format(
                "Staff[StaffId=%d, staffDos=%s, staffEducation=%s, staffProfession=%s,  staffPosition=%s, staffResponsibility=%s, staffTitlem=%s,"
                + "]",
                StaffId, staffDos, staffEducation, staffProfession , staffPosition, staffResponsibility,  staffTitle 
                );
    }
	

}
