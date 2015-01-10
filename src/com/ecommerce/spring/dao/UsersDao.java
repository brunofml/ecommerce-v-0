package com.ecommerce.spring.dao;

import org.springframework.stereotype.Component;

@Component("usersDao")
public class UsersDao {

	private String hello;

	public UsersDao() {
		System.out.println("Successefully loaded users DAO.");
	}

}
