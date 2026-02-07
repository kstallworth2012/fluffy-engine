package com.insurance.insuranceApplication.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insuranceApplication.domain.Quote;
import com.insurance.insuranceApplication.services.QuoteService;

@RestController
public class QuoteController{
	
	
	private QuoteService quoteService;
	
	
	
	
	public QuoteController(QuoteService _quoteService) {
		super();
		this.quoteService = _quoteService;
	}




	@PostMapping(path = "/quotes")
	public Quote createQuote(@RequestBody Quote _quote) {
		return quoteService.createQuote(null, _quote); 
	}
}






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