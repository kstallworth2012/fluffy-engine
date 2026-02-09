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
import com.insurance.insuranceApplication.domain.Prospect;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.domain.dto.ProspectDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.ProspectService;

@RestController
public class ProspectController{
	
	
	private ProspectService prospectService;
	private Mapper<Prospect, ProspectDto> prospectMapper; 
	
	
	
	public ProspectController(ProspectService _prospectService,Mapper<Prospect, ProspectDto> _prospectMappper) {
		super();
		this.prospectService = _prospectService;
		this.prospectMapper = _prospectMappper; 
	}




	@PostMapping(path="/Prospects")
	public ResponseEntity<ProspectDto> createProspect(@RequestBody ProspectDto _prospect) {
		Prospect prospectEntity = prospectMapper.mapFrom(_prospect);
		Prospect savedProspectEntity = prospectService.createProspect(null, prospectEntity);
		
		return new ResponseEntity<>(prospectMapper.mapTo(savedProspectEntity),HttpStatus.CREATED);
	}
	
}


//	@GetMapping(path="/")
//	public List<ProspectsDto> listProspects(){
//		List<Prospect> prospects = prospectService.findAll();
//		return prospects.stream()
//				.map(prospectMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<ProspectDto> listProspects(Pageable page){
		Page<Prospect> prospects = prospectService.findAll(page);
		return prospects.map(prospectMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<ProspectDto> getProspect(@PathVariable("id") String id){
		  Optional<Prospect> foundProspect = prospectService.findOne(id);
		  
		  
		  return foundProspect.map(prospectEntity -> {
			  		ProspectDto prospectDto = prospectMapper.mapTo(prospectEntity);
			  		return new ResponseEntity<>(prospectDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<ProspectDto> fullUpdateProspect(@PathVariable("id") String id, @RequestBody ProspectDto prospectDto){
		
		if(!prospectService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		prospectDto.setId(id);
		Prospect prospectEntity = prospectMapper.mapFrom(prospectDto);
		Prospect savedProspectEntity = prospectService.save(prospectEntity);
		
		return new ResponseEntity<>(prospectMapper.mapTo(savedProspectEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<ProspectDto> partialUpdate(@PathVariable("id") String id, @RequestBody ProspectDto prospectDto){
		
		if(!prospectService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Prospect prospectEntity = prospectMapper.mapFrom(prospectDto);
		Prospect updatedProspect = prospectService.partialUpdate(id, prospectEntity);
		
		return new ResponseEntity<>(prospectMapper.mapTo(updatedProspect), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<ProspectDto> deleteApplicant(@PathVariable("id") String id) {
		
		prospectService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

 

	}
