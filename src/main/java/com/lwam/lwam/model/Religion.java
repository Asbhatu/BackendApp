package com.lwam.lwam.model;

import java.io.Serializable;
import java.util.List;



public class Religion implements Serializable{

	private long religionId;

	
	private String religionName;
	
	
	

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

	
	
}
