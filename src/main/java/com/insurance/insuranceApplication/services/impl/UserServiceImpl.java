package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.User;
import com.insurance.insuranceApplication.services.UserService;



import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
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

	@Override
	public Page<User> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
