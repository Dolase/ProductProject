package com.mydata.web.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class ProductDto {
	
   
	private long Product_Id;
	private String Product_Name;
	private String Product_Brand;
	private String Made_in;
	private float Price;
	
	public ProductDto() {}
	public ProductDto(long product_Id, String product_Name, String product_Brand, String made_in, float price) {
		super();
		Product_Id = product_Id;
		Product_Name = product_Name;
		Product_Brand = product_Brand;
		Made_in = made_in;
		Price = price;
	}
	public long getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(long product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Brand() {
		return Product_Brand;
	}
	public void setProduct_Brand(String product_Brand) {
		Product_Brand = product_Brand;
	}
	public String getMade_in() {
		return Made_in;
	}
	public void setMade_in(String made_in) {
		Made_in = made_in;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	
	
	

}

