package com.rajesh.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
