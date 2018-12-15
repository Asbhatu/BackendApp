package com.lwam.lwam.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Weapon {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "weapon_id")
    private long teacherId;
	@Column(name = "weapon_name")
	private String weaponName;
	@Column(name = "weapon_type")
    private String weaponType;
	@Column(name = "quantity")
    private String quantity;
	
   @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userProfile_id", nullable = false)
    private UserProfile userProfile;
   
	protected Weapon() {}

    public Weapon(
    		    String weaponName,	   
    		    String weaponType,
    		     String quantity
    		   
    		) {
    	
   	
    	 this.weaponName = weaponName;
    	 this.weaponType = weaponType;
    	 this.quantity = quantity;
   
       
    }
    
  
    public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@Override
    public String toString() {
        return String.format(
                "Teacher[teacherId=%d, weaponName=%s, weaponType=%s, quantity=%s,"
                + "]",
                teacherId, weaponName, weaponType ,quantity 
                );
    }
	

}
