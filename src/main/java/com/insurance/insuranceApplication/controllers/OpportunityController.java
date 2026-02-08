package com.insurance.insuranceApplication.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Document;
import com.insurance.insuranceApplication.domain.Opportunity;
import com.insurance.insuranceApplication.domain.dto.DocumentDto;
import com.insurance.insuranceApplication.domain.dto.OpportunityDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.OpportunityService;

@RestController
public class OpportunityController{
	
	private OpportunityService opportunityService;

    private Mapper<Opportunity, OpportunityDto> opportunityMapper; 
	
	public OpportunityController(OpportunityService _opportunityService,Mapper<Opportunity, OpportunityDto> _opportunityMapper) {
		super();
		this.opportunityService = _opportunityService;
		this.opportunityMapper = _opportunityMapper; 
	}
	
	@PostMapping(path="/opportunites")
	public ResponseEntity<OpportunityDto> createOpportunity(@RequestBody OpportunityDto _opp) {
		Opportunity oppEntity = opportunityMapper.mapFrom(_opp);
		Opportunity savdOppEnity = opportunityService.createOpportunity(null, oppEntity);
		return new ResponseEntity<>(opportunityMapper.mapTo(savdOppEnity),HttpStatus.CREATED);
	}
	
	

  	@GetMapping(path="/")
	public List<OpportunityDto> listOpportunities(){
		List<Opportunity> opportunities = opportunityService.findAll();
		return opportunities.stream()
				.map(opportunityMapper::mapTo)
				.collect(Collectors.toList());
	}

  	
  
   
   	@GetMapping(path = "/{id}")
	public ResponseEntity<OpportunityDto> getOpportunity(@PathVariable("id") String id){
		  Optional<Opportunity> foundOpportunity = opportunityService.findOne(id);
		  
		  
		  return foundOpportunity.map(opportunityEntity -> {
			  OpportunityDto opportunityDto = opportunityMapper.mapTo(opportunityEntity);
			  		return new ResponseEntity<>(opportunityDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
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