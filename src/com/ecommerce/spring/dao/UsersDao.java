package com.ecommerce.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Component("usersDao")
public class UsersDao {

	@PersistenceContext(name = "ecommerceUnit")
    EntityManager em;
	
	public UsersDao() {
		System.out.println("Successefully loaded users DAO.");
	}
	
	public List<Users> getUsers(){
		TypedQuery<Users> query = em.createQuery("SELECT u FROM Users u", Users.class);
        return query.getResultList();
	}

}
