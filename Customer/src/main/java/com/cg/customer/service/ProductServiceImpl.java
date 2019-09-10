package com.cg.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customer.bean.CustomerEntity;
import com.cg.customer.bean.CustomerLogin;
import com.cg.customer.bean.Product;
import com.cg.customer.bean.WishList;
import com.cg.customer.repository.CustomerEntityRepository;
import com.cg.customer.repository.CustomerLoginRepository;
import com.cg.customer.repository.ProductRepository;
import com.cg.customer.repository.WishListRepository;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductRepository productrepo;

	@Autowired
	CustomerLoginRepository loginrepo;

	@Autowired
	CustomerEntityRepository entityrepo;

	@Autowired
	WishListRepository wishRepo;

	@Override
	public List<Product> displayAllProduct() {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList();
		list = productrepo.findAll();
		return list;
	}

	@Override
	public String login(String email, String password) {
		Optional<CustomerLogin> opt = loginrepo.findById(email);
		if (opt.isPresent()) {
			CustomerLogin login = opt.get();
			System.out.println(login.getEmail());
			if (login.getPassword().equals(password)) {
				System.out.println("Successful");
				return "Login Successful";
			} else {
				System.out.println("Failure");
				return "Login Failed";
			}
		} else {
			return "Login Failed";
		}
	}
	
	/*public String loginCustomer(String email, String password) {
		System.out.println(email);
		Optional<CustomerLogin> opt = loginrepo.findByEmail(email);
		if (opt.isPresent()) {
			CustomerLogin login = opt.get();
			if (login.getPassword().equals(password)) {
				System.out.println("Successful");
				return "Login Successful";
			} else {
				System.out.println("Failure");
				return "Login Failed";
			}
		} else {
			return "Login Failed";
		}

	}
*/
	@Override
	public CustomerEntity insertCustomer(CustomerEntity customer) {

		CustomerEntity entity = new CustomerEntity();

		
		String password = customer.getPassword();
		
		entity.setName(customer.getName());
		entity.setEmail(customer.getEmail());
		entity.setAddress(customer.getAddress());
		entity.setMobileNo(customer.getMobileNo());
		entity.setPassword(customer.getPassword());
		return entityrepo.saveAndFlush(customer);

	}

	@Override
	public WishList addToWishList(Long prod_Id) {
		
		WishList entity = new WishList();
		Product wlist = productrepo.findProduct(prod_Id);
		entity.setProdId(wlist.getProd_Id());
		entity.setProd_Category(wlist.getProd_Category());
		entity.setProd_Desc(wlist.getProd_Desc());
		entity.setProd_Discount((int) wlist.getProd_Discount());
		entity.setProd_Image(wlist.getProd_Image());
		entity.setProd_Price(wlist.getProd_Price());
		entity.setProd_Quantity(1);
		entity.setProd_Name(wlist.getProd_Name());
		return wishRepo.saveAndFlush(entity);
	}

	@Override
	public List<WishList> displayWishlist() {


		List<WishList> list = new ArrayList();
		list = wishRepo.findAll();
		return list;

	}

	@Override
	public Boolean isNewProduct(Long prodId){
		Integer val = wishRepo.checkProduct(prodId);
		if(val != 0) return false;
		else return true;
	}

	@Override
	public WishList updateWishList(Long prodId){
		Integer quantity = wishRepo.getQuantity(prodId) + 1;
		wishRepo.updateProduct(quantity, prodId);
		return new WishList();		
	}
}
