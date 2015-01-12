package com.ecommerce.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.spring.dao.UsersDao;
import com.ecommerce.spring.dao.entities.Users;
import com.ecommerce.spring.dao.repository.UsersRepository;

import java.util.List;

@Transactional
@Service("usersService")
public class UsersService {

	//private UsersDao usersDao;
	
	@Autowired
	private UsersRepository usersRepository;

//	@Autowired
//	public void setUsersDao(UsersDao usersDao) {
//		this.usersDao = usersDao;
//	}

	public List<Users> getAllUsers() {
//		Users user = new Users();
//		user.setUsername("morgado");
//		user.setName("Filipe");
//		usersRepository.save(user);
		return usersRepository.findAll();
	}
	
}
