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
import com.insurance.insuranceApplication.domain.Quote;
import com.insurance.insuranceApplication.domain.dto.ApplicantDto;
import com.insurance.insuranceApplication.domain.dto.QuoteDto;
import com.insurance.insuranceApplication.mappers.Mapper;
import com.insurance.insuranceApplication.services.QuoteService;

@RestController
public class QuoteController{
	
	
	private QuoteService quoteService;
	private Mapper<Quote, QuoteDto> quoteMapper; 
	
	
	
	
	public QuoteController(QuoteService _quoteService,Mapper<Quote, QuoteDto> _quoteMapper) {
		super();
		this.quoteService = _quoteService;
		this.quoteMapper = _quoteMapper; 
	}




	@PostMapping(path = "/quotes")
	public ResponseEntity<QuoteDto> createQuote(@RequestBody QuoteDto _quote) {
		Quote quoteEntity = quoteMapper.mapFrom(_quote);
		Quote savedQuoteEntity = quoteService.createQuote(null, quoteEntity);
		return new ResponseEntity<>(quoteMapper.mapTo(savedQuoteEntity),HttpStatus.CREATED);
	}
	
	
	
	

//	@GetMapping(path="/")
//	public List<QuoteDto> listQuotes(){
//		List<Quote> quotes = quoteService.findAll();
//		return quotes.stream()
//				.map(quoteMapper::mapTo)
//				.collect(Collectors.toList());
//	}
	
	
	//PAGEABLE
	@GetMapping(path="/")
	public Page<QuoteDto> listQuotes(Pageable page){
		Page<Quote> quotes = quoteService.findAll(page);
		return quotes.map(quoteMapper::mapTo);
	}
	
	
	
	 
	@GetMapping(path = "/{id}")
	public ResponseEntity<QuoteDto> getQuote(@PathVariable("id") String id){
		  Optional<Quote> foundQuote = quoteService.findOne(id);
		  
		  
		  return foundQuote.map(quoteEntity -> {
			  		QuoteDto quoteDto = quoteMapper.mapTo(quoteEntity);
			  		return new ResponseEntity<>(quoteDto, HttpStatus.OK);
					  
		  }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@PutMapping(path="/{id}")
	public ResponseEntity<QuoteDto> fullUpdateQuote(@PathVariable("id") String id, @RequestBody QuoteDto quoteDto){
		
		if(!quoteService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
//		quoteDto.setId(id);
		Quote quoteEntity = quoteMapper.mapFrom(quoteDto);
		Quote savedQuoteEntity = quoteService.save(quoteEntity);
		
		return new ResponseEntity<>(quoteMapper.mapTo(savedQuoteEntity), HttpStatus.OK); 
		
	}	
	
	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<QuoteDto> partialUpdate(@PathVariable("id") String id, @RequestBody QuoteDto quoteDto){
		
		if(!quoteService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		Quote quoteEntity = quoteMapper.mapFrom(quoteDto);
		Quote updatedQuote = quoteService.partialUpdate(id, quoteEntity);
		
		return new ResponseEntity<>(quoteMapper.mapTo(updatedQuote), HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<QuoteDto> deleteApplicant(@PathVariable("id") String id) {
		
		quoteService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}




