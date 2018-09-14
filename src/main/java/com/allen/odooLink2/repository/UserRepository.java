package com.allen.odooLink2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.allen.odooLink2.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	
//	boolean exists(Long id);
//	List<User> findByLastname(String lastname);
//	List<User> findByID(Long id);
}
