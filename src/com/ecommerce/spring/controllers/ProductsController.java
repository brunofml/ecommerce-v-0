package com.ecommerce.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.spring.repository.Category;
import com.ecommerce.spring.repository.Product;
import com.ecommerce.spring.service.CategoriesService;
import com.ecommerce.spring.service.ProductsService;

@Controller
public class ProductsController {

	private ProductsService productsService;
	private CategoriesService categoriesService;
	
	@Autowired
	public void setCategoriesService(CategoriesService categoriesService) {
		this.categoriesService = categoriesService;
	}

	@Autowired
	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public String showHome(Model model, @RequestParam("id") int id) {
		
		List<Product> products = new ArrayList<Product>();
		products = productsService.getProductsByCategory(categoriesService.getCategory(id));
		
		model.addAttribute("products", products);

		return "products";
	}
}
