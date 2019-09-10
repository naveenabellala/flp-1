package com.cg.customer.service;

import java.util.List;

import com.cg.customer.bean.CustomerEntity;
import com.cg.customer.bean.Product;
import com.cg.customer.bean.WishList;

import org.springframework.stereotype.Service;

@Service
public interface IProductService {
	
	//public String loginCustomer(String email, String password);
	public List<Product> displayAllProduct();
	public CustomerEntity insertCustomer(CustomerEntity customer) ;
	public WishList addToWishList(Long prodId);
	public List<WishList> displayWishlist();
	public String login(String email, String password);
	public Boolean isNewProduct(Long prodId);
	public WishList updateWishList(Long prodId);
}
