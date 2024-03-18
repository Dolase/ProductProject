package com.mydata.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.web.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
