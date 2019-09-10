package com.cg.customer.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prod_Id;
	private String prod_Name;
	private double prod_Price;
	private long prod_Quantity;
	private double prod_Discount;
	private String prod_Category;
	private String prod_Desc;
	private String prod_Image;
	
	
	public long getProd_Id() {
		return prod_Id;
	}
	public void setProd_Id(long prod_Id) {
		this.prod_Id = prod_Id;
	}
	public String getProd_Name() {
		return prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}
	public double getProd_Price() {
		return prod_Price;
	}
	public void setProd_Price(double prod_Price) {
		this.prod_Price = prod_Price;
	}
	public long getProd_Quantity() {
		return prod_Quantity;
	}
	public void setProd_Quantity(long prod_Quantity) {
		this.prod_Quantity = prod_Quantity;
	}
	public double getProd_Discount() {
		return prod_Discount;
	}
	public void setProd_Discount(double prod_Discount) {
		this.prod_Discount = prod_Discount;
	}
	public String getProd_Category() {
		return prod_Category;
	}
	public void setProd_Category(String prod_Category) {
		this.prod_Category = prod_Category;
	}
	public String getProd_Desc() {
		return prod_Desc;
	}
	public void setProd_Desc(String prod_Desc) {
		this.prod_Desc = prod_Desc;
	}
	public String getProd_Image() {
		return prod_Image;
	}
	public void setProd_Image(String prod_Image) {
		this.prod_Image = prod_Image;
	}
	
	

}
