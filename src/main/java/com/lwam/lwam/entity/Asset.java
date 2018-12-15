package com.lwam.lwam.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Asset {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "asset_id")
    private long assetId;
	@Column(name = "asset_name")
	private String assetName;
	@Column(name = "asset_type")
    private String assetType;
	@Column(name = "quantity")
    private String quantity;
   
   //@OneToMany(mappedBy = "food", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  // 	private List<Department> departments;
 
   @ManyToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "training_trainee_mapping", joinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "asset_id"), inverseJoinColumns = @JoinColumn(name = "department_id", referencedColumnName = "department_id"))
   private Set<Department> departments; 
	   
	protected Asset() {}

    public Asset(
    		    String assetName,	   
    		    String assetType,
    		     String quantity
    		   
    		) {
    	
   	
    	 this.assetName = assetName;
    	 this.assetType = assetType;
    	 this.quantity = quantity;
   
       
    }
    
    
  
    public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	public long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	
	@Override
    public String toString() {
        return String.format(
                "Teacher[assetId=%d, assetName=%s, assetType=%s, quantity=%s,"
                + "]",
                assetId, assetName, assetType ,quantity 
                );
    }
	

}
