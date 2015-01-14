package com.ecommerce.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Integer> {

	//List<Product> findByProducts(Category category);
}
