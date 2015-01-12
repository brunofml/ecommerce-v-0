package com.ecommerce.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.spring.dao.UsersDao;
import com.ecommerce.spring.dao.entities.Users;
import com.ecommerce.spring.service.UsersService;

@Controller
public class HomeController {

	private UsersService usersService;

	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/")
	public String showHome(Model model) {
		List<Users> users = new ArrayList<Users>();
		users = usersService.getAllUsers();
		model.addAttribute("users", users);

		return "home";
	}
}
