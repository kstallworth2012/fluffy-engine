package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.User;

public interface UserService{
	
	
	User createUser(String UserName, User _userName);
    
    List<User> findAll();

    Optional<User> findOne(String _userName);
	
	boolean isExists(String _userName);


	User partialUpdate(String user_id, User userEntity );

	void delete(String user_id);
	
	
	
}