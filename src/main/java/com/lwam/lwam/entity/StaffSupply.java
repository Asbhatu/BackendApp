package com.lwam.lwam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class StaffSupply {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "staff_supply_id")
    private long staffSupplyId;
    @Column(name = "Salary")
    private String salary;
    @Column(name = "offic_supply")
    private String officeSupply;
    @Column(name = "other_supply")
    private String othergSupply;
    
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
   
	protected StaffSupply() {}

    public StaffSupply(
    		    String salary,
    		    String officeSupply,
    		    String othergSupply
    		   
    		    
    		) {
    	
    	
    	 this.salary = salary;
    	 this.officeSupply = officeSupply;
    	 this.othergSupply = othergSupply;
    	
    	 
    }
    
   
    
    public long getStaffSupplyId() {
		return staffSupplyId;
	}

	public void setStaffSupplyId(long staffSupplyId) {
		this.staffSupplyId = staffSupplyId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getOfficeSupply() {
		return officeSupply;
	}

	public void setOfficeSupply(String officeSupply) {
		this.officeSupply = officeSupply;
	}

	public String getOthergSupply() {
		return othergSupply;
	}

	public void setOthergSupply(String othergSupply) {
		this.othergSupply = othergSupply;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
    public String toString() {
        return String.format(
                "Container[staffSupplyId=%d, salary=%s, officeSupply=%s, othergSupply=%s,"
                + "]",
                staffSupplyId, salary, officeSupply, othergSupply
                );
    }
	

}
