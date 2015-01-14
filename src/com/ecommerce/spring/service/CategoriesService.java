package com.ecommerce.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.spring.repository.CategoriesRepository;
import com.ecommerce.spring.repository.Category;

@Transactional
@Service("categoriesService")
public class CategoriesService {

	@Autowired
	private CategoriesRepository categoriesRepository;
	
	public List<Category> getAllCategories() {
		return categoriesRepository.findAll();	
	}

	public Category getCategory(int id) {
		return categoriesRepository.findOne(id);	
	}
}
