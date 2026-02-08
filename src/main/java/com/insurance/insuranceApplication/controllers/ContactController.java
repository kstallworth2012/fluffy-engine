package com.insurance.insuranceApplication.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.Contact;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.domain.dto.ContactDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController{
	
	
	
	private  ContactService contactService;

	private Mapper<Contact, ContactDto> contactMapper; 
	
	public ContactController(ContactService _contactService, Mapper<Contact, ContactDto> _contactMapper) {
		super();
		this.contactService = _contactService;
		this.contactMapper = _contactMapper;
	} 
	
	
	@PostMapping(path="/new-contact")
	public ResponseEntity<ContactDto> createContact(@RequestBody ContactDto _contact) {
		
		Contact contactEntity = contactMapper.mapFrom(_contact);
		Contact savedContactEntity = contactService.createContact(null, contactEntity);
		return new ResponseEntity<>(contactMapper.mapTo(savedContactEntity), HttpStatus.CREATED) ;
	}
	
	
	
	@GetMapping(path="/")
	public List<ContactDto> listContacts(){
		List<Contact> contacts = contactService.findAll();
		return contacts.stream()
				.map(contactMapper::mapTo)
				.collect(Collectors.toList());
	}
	 
	
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ContactDto> getContact(@PathVariable("id") String id){
		  Optional<Contact> foundContact = contactService.findOne(id);
		  
		  
		  return foundContact.map(contactEntity -> {
			  		ContactDto contactDto = contactMapper.mapTo(contactEntity);
			  		return new ResponseEntity<>(contactDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	 
	
	

	@PutMapping(path="/{id}")
	public ResponseEntity<ContactDto> fullUpdateContact(@PathVariable("id") String id, @RequestBody ContactDto contactDto){
		
		if(!contactService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		contactDto.setId(id);
		Contact contactEntity = contactMapper.mapFrom(contactDto);
		Contact savedContactEntity = contactService.save(contactEntity);
		
		return new ResponseEntity<>(contactMapper.mapTo(savedContactEntity), HttpStatus.OK); 
		
	}	
	

	
	
	 	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<ContactDto> partialUpdate(@PathVariable("id") String id, @RequestBody ContactDto contactDto){
		
		if(!contactService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
	 	Contact contactEntity = contactMapper.mapFrom(contactDto);
		Contact updatedContact = contactService.partialUpdate(id, contactEntity);
		
		return new ResponseEntity<>(contactMapper.mapTo(updatedContact), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<ContactDto> deleteApplicant(@PathVariable("id") String id) {
		
		contactService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
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