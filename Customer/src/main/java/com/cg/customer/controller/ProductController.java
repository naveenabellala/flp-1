package com.cg.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.customer.bean.CustomerEntity;
import com.cg.customer.bean.Product;
import com.cg.customer.bean.WishList;
import com.cg.customer.service.ProductServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl service;

	@GetMapping(value = "/login/{email}/{password}")
	public ResponseEntity<String> login(@PathVariable("email") String email,
			@PathVariable("password") String password) {
		String returnType = service.login(email, password);
		RequestResponse result = new RequestResponse(true, returnType);
		return new ResponseEntity<String>(returnType, HttpStatus.OK);
	}

	@GetMapping(value = "/login/")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> list = new ArrayList<>();
		list = service.displayAllProduct();
		return ResponseEntity.ok(list);
	}

	@PostMapping(value = "/customer")
	public ResponseEntity<CustomerEntity> addCustomer(@RequestBody CustomerEntity cust) {
		CustomerEntity result = service.insertCustomer(cust);
		// return new ResponseEntity<User>(result, HttpStatus.OK);
		return new ResponseEntity<CustomerEntity>(result, HttpStatus.OK);
	}

	@PostMapping(value = "/wishlist/{prod_Id}")
	public ResponseEntity<WishList> addToWishList(@PathVariable("prod_Id") Long prod_Id) {
		System.out.println(prod_Id);
		WishList result;
		if(service.isNewProduct(prod_Id)) result = service.addToWishList(prod_Id);
		else result = service.updateWishList(prod_Id);
		return new ResponseEntity<WishList>(result, HttpStatus.OK);
	}

	@GetMapping(value = "/wishlist/")
	public ResponseEntity<List<WishList>> showWishlist() {
		
		List<WishList> list=new ArrayList<>();
		list = service.displayWishlist();
		return ResponseEntity.ok(list);

	}
	
	
}
