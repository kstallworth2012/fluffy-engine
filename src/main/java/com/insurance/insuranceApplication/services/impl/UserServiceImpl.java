package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.User;
import com.insurance.insuranceApplication.services.UserService;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User createUser(String UserName, User _userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findOne(String _userName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _userName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User partialUpdate(String user_id, User userEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String user_id) {
		// TODO Auto-generated method stub
		
	}

}
