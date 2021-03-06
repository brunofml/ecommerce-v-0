package com.ecommerce.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.spring.repository.Category;
import com.ecommerce.spring.repository.Product;
import com.ecommerce.spring.service.CategoriesService;
//import com.ecommerce.spring.dao.UsersDao;
import com.ecommerce.spring.service.ProductsService;

@Controller
public class HomeController {

	private CategoriesService categoriesService;
	private ProductsService productsService;

	@Autowired
	public void setCategoriesService(CategoriesService categoriesService) {
		this.categoriesService = categoriesService;
	}
	
	@Autowired
	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}


	@RequestMapping("/")
	public String showHome(Model model) {
		
		List<Category> categories = new ArrayList<Category>();
		categories = categoriesService.getAllCategories();
		List<Product> products = new ArrayList<Product>();
		products = productsService.getRecent();

		model.addAttribute("categories", categories);
		model.addAttribute("products", products);

		return "home";
	}
}
