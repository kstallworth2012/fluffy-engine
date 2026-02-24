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
  
  	
	
   	
   	
   	
 

	@PutMapping(path="/{id}")
	public ResponseEntity<OpportunityDto> fullUpdateOpportunity(@PathVariable("id") String id, @RequestBody OpportunityDto oopDto){
		
		if(opportunityService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
//		oopDto.setId(id);
		Opportunity opportunityEntity = opportunityMapper.mapFrom(oopDto);
		Opportunity savedOpportunityEntity = opportunityService.save(opportunityEntity);
		
		return new ResponseEntity<>(opportunityMapper.mapTo(savedOpportunityEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<OpportunityDto> partialUpdate(@PathVariable("id") String id, @RequestBody OpportunityDto oopDto){
		
		if(!opportunityService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Opportunity opportunityEntity = opportunityMapper.mapFrom(oopDto);
		Opportunity updatedOpportunity = opportunityService.partialUpdate(id, opportunityEntity);
		
		return new ResponseEntity<>(opportunityMapper.mapTo(updatedOpportunity), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<OpportunityDto> deleteDocument(@PathVariable("id") String id) {
		
		opportunityService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
   	
   	
   	
	
	
	
	
	
	
	
}


