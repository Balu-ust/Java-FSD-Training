package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medicine {
	
	
	@Id
	private String id;
	private String medname;
	private String quantity;
	private String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMedname() {
		return medname;
	}
	public void setMedname(String medname) {
		this.medname = medname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medname=" + medname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
public Medicine() {
		
	}
	public Medicine(String id, String medname, String quantity, String price) {
		
		this.id = id;
		this.medname = medname;
		this.quantity = quantity;
		this.price = price;
	}
	

}
