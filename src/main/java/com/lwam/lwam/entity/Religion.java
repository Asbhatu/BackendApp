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
@Table(name = "religion")
public class Religion implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "religion_id")
	private long religionId;

	@Column(name = "religion_name")
	private String religionName;
	
	public Religion() {
		
	}
	
	
	public Religion(String religionName) {
		
		this.religionName = religionName;
			
	}
	
	

	public long getReligionId() {
		return religionId;
	}


	public void setReligionId(long religionId) {
		this.religionId = religionId;
	}


	public String getReligionName() {
		return religionName;
	}


	public void setReligionName(String religionName) {
		this.religionName = religionName;
	}

	
	@OneToMany(mappedBy = "religion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserProfile> userProfiles;
	
	
	
	
	@Override
	public String toString() {
		return String.format("Religion[religionId=%d, religionName='%s']", religionId, religionName);
	}
	
	
}
