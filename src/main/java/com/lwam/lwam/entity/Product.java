package com.lwam.lwam.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Product {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "product_id")
    private long productId;
    @Column(name = "quantity")
    private long quantity;
    @Column(name = "price")
    private long price;
    @Column(name = "product_name")
    private String name;
    
    @ManyToMany(mappedBy = "products")
   	private Set<Supplier> suppliers;
    
    
	protected Product() {}

    public Product(
    		long quantity,
    		long price,
    		String name
    		    
    		    
    		) {
    	
    	
    	 this.quantity = quantity;
    	 this.price = price; 	
    	 this.name = name;  	 
   
    }
    
   
    
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

	public Set<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	@Override
    public String toString() {
        return String.format("Product[productId=%d, quantity='%d', price='%d', name='%s']", productId, quantity, price , name);
    }
	

}
