package com.example.demo.Repositary;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


		@Query("Select p from Product p where p.productName = ?1")
		
		public abstract Product findByProductName(String productName);


}