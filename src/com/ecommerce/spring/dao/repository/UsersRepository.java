package com.ecommerce.spring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.spring.dao.entities.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}
