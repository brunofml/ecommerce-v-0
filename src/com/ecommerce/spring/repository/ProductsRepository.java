package com.ecommerce.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductsRepository extends JpaRepository<Product, Integer> {

	// User findFirstByOrderByLastname();
	//
	// User findTopByOrderByAgeDesc();
	//
	// Page<User> queryFirst10ByLastname(String lastname, Pageable pageable);
	//
	// Slice<User> findTop3ByLastname(String lastname, Pageable pageable);

	List<Product> findFirst3ByOrderByCreatedAtDesc();

	List<Product> findByCategory(Category category);

	// List<User> findTop10ByLastname(String lastname, Pageable pageable);

}
