package com.ecommerce.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.spring.dao.Users;
import com.ecommerce.spring.dao.UsersDao;

import java.util.List;

@Service("usersService")
public class UsersService {

	private UsersDao usersDao;

	@Autowired
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public List<Users> getAllUsers() {
		return usersDao.getUsers();
	}

}
