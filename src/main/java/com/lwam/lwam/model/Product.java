package com.lwam.lwam.model;

import java.util.Set;

import javax.persistence.*;


public class Product {
	
	private static final long serialVersionUID = -3009157732242241606L;

    private long productId;
 
    private long quantity;
  
    private long price;
 
    private String name;
 
	
   
    
    public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
