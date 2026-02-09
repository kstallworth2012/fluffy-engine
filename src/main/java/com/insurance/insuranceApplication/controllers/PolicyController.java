package com.insurance.insuranceApplication.controllers;

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
import com.insurance.insuranceApplication.domain.Opportunity;
import com.insurance.insuranceApplication.domain.Policy;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.domain.dto.OpportunityDto;
import com.insurance.insuranceApplication.domain.dto.PolicyDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.PolicyService;

@RestController
public class PolicyController{
	
	private PolicyService policyService;
	private Mapper<Policy, PolicyDto> policyMapper;
	
	
	
	
	public PolicyController(PolicyService _policyService, Mapper<Policy, PolicyDto> _policyMapper) {
		super();
		this.policyService = _policyService;
		this.policyMapper = _policyMapper;
	}


	
	@PostMapping(path="/new-policy")
	public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto _policy) {
			Policy policyEntity = policyMapper.mapFrom(_policy);
			Policy savedPolicyEntity = policyService.createPolicy(null, policyEntity);
			
			return new ResponseEntity<>(policyMapper.mapTo(savedPolicyEntity), HttpStatus.CREATED);
	}
	
//	@GetMapping(path="/")
//	public List<PolicyDto> listPolicies(){
//		List<Applicant> applicants = appService.findAll();
//		return applicants.stream()
//				.map(applicantMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<PolicyDto> listApplicants(Pageable page){
		Page<Policy> policies = policyService.findAll(page);
		return  policies.map(policyMapper::mapTo);
	}
	
	
	


//	@PostMapping(path="/policies")
//	public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto _policy) {
//		
//		Policy policyEntity = policyMapper.mapFrom(_policy);
//		Policy savedPolicyEntity = policyService.createPolicy(null, policyEntity);
//		return new ResponseEntity<>(policyMapper.mapTo(savedPolicyEntity),HttpStatus.CREATED);
//	}
//	
	
   	
	 

	@PutMapping(path="/{id}")
	public ResponseEntity<PolicyDto> fullUpdateOpportunity(@PathVariable("id") String id, @RequestBody PolicyDto policyDto){
		
		if(policyService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		policyDto.setId(id);
		Policy policyEntity = policyMapper.mapFrom(policyDto);
		Policy savedPolicyEntity = policyService.save(policyEntity);
		
		return new ResponseEntity<>(policyMapper.mapTo(savedPolicyEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<PolicyDto> partialUpdate(@PathVariable("id") String id, @RequestBody PolicyDto policyDto){
		
		if(!policyService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Policy policyEntity = policyMapper.mapFrom(policyDto);
		Policy updatedPolicy = policyService.partialUpdate(id, policyEntity);
		
		return new ResponseEntity<>(policyMapper.mapTo(updatedPolicy), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<PolicyDto> deleteDocument(@PathVariable("id") String id) {
		
		policyService.delete(id);
		
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