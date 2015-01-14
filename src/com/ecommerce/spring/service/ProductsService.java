package com.ecommerce.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.spring.repository.Category;
import com.ecommerce.spring.repository.Product;
import com.ecommerce.spring.repository.ProductsRepository;

@Service("productsService")
public class ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	public List<Product> getAllProducts() {
		return productsRepository.findAll();	
	}
	
	public List<Product> getRecent() {
		return productsRepository.findFirst3ByOrderByCreatedAtDesc();	
	}

	public List<Product> getProductsByCategory(Category category) {
		return productsRepository.findByCategory(category);
	}

}
