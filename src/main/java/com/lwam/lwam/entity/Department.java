package com.lwam.lwam.entity;

import java.io.Serializable;
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
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department implements Serializable{
	
	private static long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id")
	private long departmentId;
	@Column(name = "department_name")
	private String departmentName;
	
	//@OneToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "user_profile_id", nullable = false)
    //private UserProfile userProfile;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserProfile> userProfiles;
	
	/*
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Food food;
	public Department() {
		
	}
	*/
	
	
    public Department() {
		
		
			
	}
	
   
	 @ManyToMany(mappedBy = "departments")
	 private Set<Asset> assets;
	
	public Department(String departmentName) {
		
		this.departmentName = departmentName;
			
	}
	
	


	public long getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	   
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}




	public List<UserProfile> getUserProfiles() {
		return userProfiles;
	}




	public void setUserProfiles(List<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}




	public Set<Asset> getAssets() {
		return assets;
	}




	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}




	@Override
	public String toString() {
		return String.format("Department[departmentId=%d, departmentName='%s']", departmentId, departmentName);
	}
	
	
}
