package com.lwam.lwam.model;

import java.io.Serializable;
import java.util.List;


public class Biher {
	
	
	private long biherId;

	
	private String biherName;
	
	
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

	

	
}
