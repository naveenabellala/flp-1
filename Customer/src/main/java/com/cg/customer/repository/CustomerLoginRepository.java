package com.cg.customer.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.customer.bean.CustomerLogin;
@Repository
public interface CustomerLoginRepository extends JpaRepository<CustomerLogin, String> {

	@Query("from CustomerLogin cust where cust.email = :email")
	Optional<CustomerLogin> findByEmail(@Param("email")String email);

	

}
