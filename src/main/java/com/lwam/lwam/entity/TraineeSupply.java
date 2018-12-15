package com.lwam.lwam.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class TraineeSupply {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "trainee_supply_id")
    private long traineeSupplyId;
    @Column(name = "shoes")
    private String shoes;
    @Column(name = "uniform")
    private String uniform;
    @Column(name = "medicine_supply")
    private String medicineSupply;
    @Column(name = "food_supply")
    private String foodSupply;
    @Column(name = "cleaning_supply")
    private String cleaningSupply;
    @Column(name = "goods")
    private String goods;
    @Column(name = "Salary")
    private String bed;
    @Column(name = "bed_clothes")
    private String bedClothes;
    @Column(name = "military_supply")
    private String militarySupply;
    @Column(name = "school_supply")
    private String schooSupply;
    
    @ManyToOne
    @JoinColumn(name = "trainee_id")
    private Trainee trainee;

	protected TraineeSupply() {}

    public TraineeSupply(
    		    String shoes,
    		    String uniform,
    		    String medicineSupply,
    		    String foodSupply,
    		     String cleaningSupply,
    		     String goods,
    		     String bed,
    		     String bedClothes,
    		     String militarySupply,
    		     String schooSupply
    		) {
    	
    	
    	 this.shoes = shoes;
    	 this.uniform = uniform;
    	 this.medicineSupply = medicineSupply;
    	 this.foodSupply = foodSupply;
    	 this.cleaningSupply = cleaningSupply;
    	 this.goods = goods;
    	 this.bed = bed;	 
    	 this.bedClothes = bedClothes;
    	 this.militarySupply = militarySupply;
    	 this.schooSupply = schooSupply;
    	
    	 
        
       
    }
    
   
    
    public long getTraineeSupplyId() {
		return traineeSupplyId;
	}

	public void setTraineeSupplyId(long traineeSupplyId) {
		this.traineeSupplyId = traineeSupplyId;
	}

	

	public String getShoes() {
		return shoes;
	}

	public void setShoes(String shoes) {
		this.shoes = shoes;
	}

	public String getUniform() {
		return uniform;
	}

	public void setUniform(String uniform) {
		this.uniform = uniform;
	}

	public String getMedicineSupply() {
		return medicineSupply;
	}

	public void setMedicineSupply(String medicineSupply) {
		this.medicineSupply = medicineSupply;
	}

	public String getFoodSupply() {
		return foodSupply;
	}

	public void setFoodSupply(String foodSupply) {
		this.foodSupply = foodSupply;
	}

	public String getCleaningSupply() {
		return cleaningSupply;
	}

	public void setCleaningSupply(String cleaningSupply) {
		this.cleaningSupply = cleaningSupply;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public String getBedClothes() {
		return bedClothes;
	}

	public void setBedClothes(String bedClothes) {
		this.bedClothes = bedClothes;
	}

	public String getMilitarySupply() {
		return militarySupply;
	}

	public void setMilitarySupply(String militarySupply) {
		this.militarySupply = militarySupply;
	}

	public String getSchooSupply() {
		return schooSupply;
	}

	public void setSchooSupply(String schooSupply) {
		this.schooSupply = schooSupply;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
    public String toString() {
        return String.format(
                "Container[traineeSupplyId=%d, shoes=%s, uniform=%s, medicineSupply=%s, foodSupply=%s,"
                + "cleaningSupply='%s', goods='%s', bed='%s', bedClothes='%s', militarySupply='%s',schooSupply='%s'"
                + "]",
                traineeSupplyId, shoes, uniform, medicineSupply ,foodSupply,  cleaningSupply, goods, bed, bedClothes, militarySupply,
                schooSupply);
    }
	

}
