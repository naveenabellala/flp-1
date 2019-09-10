package com.cg.customer.repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.cg.customer.bean.WishList;;

@Repository
public interface WishListRepository extends JpaRepository<WishList,Long>{

    @Query(
        value = "Select count(*) from wishlist_product wPro where wPro.prod_id = :prod_Id",
        nativeQuery = true)
    int checkProduct(@Param("prod_Id") Long prod_Id);

    @Query(
        value = "Select prod_Quantity from wishlist_product wPro where wPro.prod_id = :prod_Id",
        nativeQuery = true)
    int getQuantity(@Param("prod_Id") Long prod_Id);

    @Modifying
    @Query(
        value = "update wishlist_product wPro set wPro.prod_Quantity = :quantity where wPro.prod_id = :prod_Id",
        nativeQuery = true)
    int updateProduct(@Param("quantity") Integer quantity, @Param("prod_Id") Long prod_Id);
}
