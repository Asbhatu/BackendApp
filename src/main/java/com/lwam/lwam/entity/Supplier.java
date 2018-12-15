package com.lwam.lwam.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Supplier {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "supplier_id")
    private long supplierId;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "supplier_name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "supplierr_product_mapping", joinColumns = @JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id"), inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id"))
    private Set<Product> products;  

    
	protected Supplier() {}

    public Supplier(
    		
    		String phoneNumber,
    		String name
   		
    		  		    
    		) {
    	
    	
    	 this.phoneNumber = phoneNumber;
    	  	
    	 this.name = name;
    	 
   
    }
    
    

   
    public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
    public String toString() {
        return String.format(
                "Container[supplierId=%d, phoneNumber='%s', name='%s'"
                + "]", supplierId, phoneNumber, name);
    }
	

}
