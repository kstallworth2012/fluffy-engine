package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.User;

public interface UserService{
	
	
	User createUser(String UserName, User _userName);
    
    List<User> findAll();

    Optional<User> findOne(String _userName);
    Page<User> findAll(Pageable _pageable);

	boolean isExists(String _userName);


	User partialUpdate(String user_id, User userEntity );

	void delete(String user_id);

	User save(User userEntity);
	
	
	
}