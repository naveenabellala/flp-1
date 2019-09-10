package com.cg.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.customer.bean.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	@Query("from Product product where product.prod_Id = :prod_Id")
	Product findProduct(@Param("prod_Id") Long prod_Id);

}
