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
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.domain.Contact;
import com.insurance.insuranceApplication.domain.Document;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.domain.dto.ContactDto;
import com.insurance.insuranceApplication.domain.dto.DocumentDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.DocumentService;

@RestController
public class DocumentController{
	
	
	
	private DocumentService documentService;
	private Mapper<Document, DocumentDto> documentMapper; 
	
	
	
	public DocumentController(DocumentService _documentService, Mapper<Document, DocumentDto> _documentMapper) {
		super();
		this.documentService = _documentService;
		this.documentMapper = _documentMapper; 
	} 
	
	@PostMapping(path="/documents")
	public ResponseEntity<DocumentDto> createDocument(@RequestBody DocumentDto _document) {
		
		Document documentEntity = documentMapper.mapFrom(_document);
		Document savedDocumentEntity = documentService.createDocument(null, documentEntity);
		
		return new ResponseEntity<>(documentMapper.mapTo(savedDocumentEntity),HttpStatus.CREATED);
	}
	
	

  	@GetMapping(path="/")
	public List<DocumentDto> listDocuments(){
		List<Document> documents = documentService.findAll();
		return documents.stream()
				.map(documentMapper::mapTo)
				.collect(Collectors.toList());
	}

  	
  
   
   	@GetMapping(path = "/{id}")
	public ResponseEntity<DocumentDto> getDocument(@PathVariable("id") String id){
		  Optional<Document> foundDocument = documentService.findOne(id);
		  
		  
		  return foundDocument.map(documentEntity -> {
			  DocumentDto documentDto = documentMapper.mapTo(documentEntity);
			  		return new ResponseEntity<>(documentDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
  
  	
   
	 

	@PutMapping(path="/{id}")
	public ResponseEntity<DocumentDto> fullUpdateDocument(@PathVariable("id") String id, @RequestBody DocumentDto docDto){
		
		if(documentService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		docDto.setId(id);
		Document documentEntity = documentMapper.mapFrom(docDto);
		Document savedDocumentEntity = documentService.save(documentEntity);
		
		return new ResponseEntity<>(documentMapper.mapTo(savedDocumentEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<DocumentDto> partialUpdate(@PathVariable("id") String id, @RequestBody DocumentDto docDto){
		
		if(!documentService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Document documentEntity = documentMapper.mapFrom(docDto);
		Document updatedDocument = documentService.partialUpdate(id, documentEntity);
		
		return new ResponseEntity<>(documentMapper.mapTo(updatedDocument), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<DocumentDto> deleteDocument(@PathVariable("id") String id) {
		
		documentService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}


   	
  
	
	/*
	@GetMapping(path = "/{id}")
	public ResponseEntity<DocumentDto> getDocument(@PathVariable("id") String id){
		  Optional<Contact> foundDocument = documentService.findOne(id);
		  
		  
		  return foundContact.map(contactEntity -> {
			  		ContactDto contactDto = contactMapper.mapTo(contactEntity);
			  		return new ResponseEntity<>(contactDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	 */
	
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
// public class ____Controller{



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