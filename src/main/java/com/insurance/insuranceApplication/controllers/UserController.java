package com.insurance.insuranceApplication.controllers;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.User;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.domain.dto.UserDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.UserService;

@RestController
public class UserController{
	
	
	private UserService userService;
	private Mapper<User,UserDto> userMapper; 
	
	
	
	public UserController(UserService _userService,Mapper<User,UserDto> _userMapper) {
		super();
		this.userService = _userService;
		this.userMapper = _userMapper; 
	}




	@PostMapping(path="/Users")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto _user) {
		User userEntity = userMapper.mapFrom(_user);
		User savedUserEntity = userService.createUser(null, userEntity);
		
		return new ResponseEntity<>(userMapper.mapTo(savedUserEntity), HttpStatus.CREATED);
		
	}

//	@GetMapping(path="/")
//	public List<UserDto> listUsers(){
//		List<User> users = userService.findAll();
//		return users.stream()
//				.map(userMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<UserDto> listUsers(Pageable page){
		Page<User> users = userService.findAll(page);
		return users.map(userMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<UserDto> getUser(@PathVariable("id") String id){
		  Optional<User> foundUser = userService.findOne(id);
		  
		  
		  return foundUser.map(userEntity -> {
			  		UserDto userDto = userMapper.mapTo(userEntity);
			  		return new ResponseEntity<>(userDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<UserDto> fullUpdateUser(@PathVariable("id") String id, @RequestBody UserDto userDto){
		
		if(!userService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
//		userDto.setId(id);
		User userEntity = userMapper.mapFrom(userDto);
		User savedUserEntity = userService.save(userEntity);
		
		return new ResponseEntity<>(userMapper.mapTo(savedUserEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<UserDto> partialUpdate(@PathVariable("id") String id, @RequestBody UserDto userDto){
		
		if(!userService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		User userEntity = userMapper.mapFrom(userDto);
		User updatedUser = userService.partialUpdate(id, userEntity);
		
		return new ResponseEntity<>(userMapper.mapTo(updatedUser), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<UserDto> deleteApplicant(@PathVariable("id") String id) {
		
		userService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}


	
}


