package com.lwam.lwam.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Department implements Serializable{
	
	
	private long departmentId;
	
	private String departmentName;
	
	
	
    public Department() {
		
		
			
	}
	
   
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



	@Override
	public String toString() {
		return String.format("Department[departmentId=%d, departmentName='%s']", departmentId, departmentName);
	}
	
	
}
