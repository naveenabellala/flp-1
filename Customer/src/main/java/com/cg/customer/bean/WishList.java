package com.cg.customer.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wishlist_product")
public class WishList {
	@Column(name = "prod_id") private Long prodId;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wishlist_id") private long wishlistId;
	
	private String prod_Name;

	private Double prod_Price;
	private Integer prod_Quantity;
	private Integer prod_Discount;
	
	private String prod_Category;
	private String prod_Desc;
	private String prod_Image;
	
	public long getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(long wishlistId) {
		this.wishlistId = wishlistId;
	}	
	
	public String getProd_Name() {
		return prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		this.prod_Name = prod_Name;
	}
	public Double getProd_Price() {
		return prod_Price;
	}
	public void setProd_Price(Double prod_Price) {
		this.prod_Price = prod_Price;
	}
	public Integer getProd_Quantity() {
		return prod_Quantity;
	}
	public void setProd_Quantity(Integer prod_Quantity) {
		this.prod_Quantity = prod_Quantity;
	}
	public Integer getProd_Discount() {
		return prod_Discount;
	}
	public void setProd_Discount(Integer prod_Discount) {
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
	
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	
	
	
}
