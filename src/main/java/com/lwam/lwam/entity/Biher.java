package com.lwam.lwam.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "biher")
public class Biher implements Serializable{
	
	private static long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "biher_id")
	private long biherId;

	@Column(name = "biher_name")
	private String biherName;
	
	//@OneToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "user_profile_id", nullable = false)
	@OneToMany(mappedBy = "biher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserProfile> userProfiles;
	      
    //private List<UserProfile> userProfiles;
	
	public Biher() {
		
	}
	
	
	public Biher(String biherName) {
		
		this.biherName = biherName;
			
	}
	

	public long getBiherId() {
		return biherId;
	}


	public void setBiherId(long biherId) {
		this.biherId = biherId;
	}


	public String getBiherName() {
		return biherName;
	}


	public void setBiherName(String biherName) {
		this.biherName = biherName;
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


	@Override
	public String toString() {
		return String.format("Biher[biherId=%d, biherName='%s']", biherId, biherName);
	}
	
	
}
