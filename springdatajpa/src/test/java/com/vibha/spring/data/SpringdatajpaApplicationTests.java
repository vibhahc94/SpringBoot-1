package com.vibha.spring.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.vibha.spring.data.entities.Product;
import com.vibha.spring.data.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;
	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(5L);
		product.setName("Asus");
		product.setDescription("Good");
		product.setPrice(12000);
		repository.save(product);
	}

}
