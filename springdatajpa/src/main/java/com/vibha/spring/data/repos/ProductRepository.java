package com.vibha.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.vibha.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	
}
