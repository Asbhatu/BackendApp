package com.lwam.lwam.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Food {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "food_id")
    private long foodId;
	@Column(name = "food_name")
	private String foodName;
	@Column(name = "food_type")
    private String foodEype;
	@Column(name = "quantity")
    private Double quantity;
	@Column(name = "unit")
    private String unit;
	
    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Supplier> suppliers;
		
	
	protected Food() {}

    public Food(
    		    String foodName,	   
    		    String foodEype,
    		     Double quantity,
    		     String unit
    		   
    		) {
    	
   	
    	 this.foodName = foodName;
    	 this.foodEype = foodEype;
    	 this.quantity = quantity;
    	 this.unit = unit;
   
       
    }
   
 
    
    public long getFoodId() {
		return foodId;
	}

	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodEype() {
		return foodEype;
	}

	public void setFoodEype(String foodEype) {
		this.foodEype = foodEype;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	@Override
    public String toString() {
        return String.format(
                "Teacher[teacherId=%d, foodName=%s, foodEype=%s, quantity=%s, unit=%s,"
                + "]",
                foodId, foodName, foodEype ,quantity, unit
                );
    }
	

}
