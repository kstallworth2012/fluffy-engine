package com.insurance.insuranceApplication.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Contact;
import com.insurance.insuranceApplication.domain.dto.ContactDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.ContactService;

@RestController
public class ContactController{
	
	
	
	private  ContactService contactService;

	private Mapper<Contact, ContactDto> contactMapper; 
	
	public ContactController(ContactService _contactService, Mapper<Contact, ContactDto> _contactMapper) {
		super();
		this.contactService = _contactService;
		this.contactMapper = _contactMapper;
	} 
	
	
	@PostMapping(path="/contacts")
	public ContactDto createContact(@RequestBody ContactDto _contact) {
		
		Contact contactEntity = contactMapper.mapFrom(_contact);
		Contact savedContactEntity = contactService.createContact(null, contactEntity);
		return contactMapper.mapTo(savedContactEntity);
	}
	
	
	
}
// import com.insurance.insuranceApplication.services._____
// import com.insurance.insuranceApplication.domain.dto._______
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody; 
// import org.springframework.web.bind.annotation.ResponseStatus;
// import org.springframework.web.server.ResponseStatusException;
// import jakarta.validation.Valid;
// import org.springframework.http.HttpStatus;
// import java.util.ArrayList; 
// import java.util.List; 
// import java.util.Optional;




// @RestController
// @RequestMapping("/api/___") 




// private ___Service ___Service;


// public ____Controller(___Service _---service)
// {

//     this._____Service = _---service;
// }
// /*
// //find all members in all projects
// //@GetMapping("api/tasks")
// @GetMapping("")
// List<Tasks> findAll(){
//    return .findAll(); 
// }


// @GetMapping("/{id}")
// Tasks findById(@PathVariable Integer id){
    
// @Optional<> _ = TasksRepository.findById(id);
// if(_.isEmpty()){

// 	throw new RespponseStatusException(HttpStatus.NOT_FOUND,"Task not found.");
// }
//   return _member.get();

//   //  return membersRepository.findById(id).get();

// }

// */


// //post
// @ResponseStatus(HttpStatus.CREATED)  //201 status
// @PostMapping("")
// public ______Dto create_____(@RequestBody ____Dto _-----DTO){

//     return ______Service.create(_-----DTO);


// }


// /*
// //put
// @ResponseStatus(HttpStatus.NO_CONTENT)  //
// @PutMapping("/{id}")
// void updateTask(@RequestBody Object _object,Integer _id){

//     Repository.update__(_object,_id);


// }

// //delete
// @ResponseStatus(HttpStatus.NO_CONTENT)  //
// @PutMapping("/{id}")
// void delete__(@RequestBody Object _object ,Integer _id){

//     //.delete(_,_id);


// }
// */
// }