package com.lwam.lwam.model;


import java.util.List;
import java.util.Set;


public class Food {
	
	
    private long foodId;

	private String foodName;

    private String foodEype;
	
    private Double quantity;
	
    private String unit;
	
  
    
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


}
