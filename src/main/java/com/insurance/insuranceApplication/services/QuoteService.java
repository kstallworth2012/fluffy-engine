package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.Quote;

public interface QuoteService{
	
	
	
	
	
	Quote createQuote(String quote, Quote _quote);
    
    List<Quote> findAll();

    Optional<Quote> findOne(String _quote);
    
    Page<Quote> findAll(Pageable _pageable);

	
	boolean isExists(String _quote);


	Quote partialUpdate(String quote_id, Quote quoteEntity );

	void delete(String quote_id);

	Quote save(Quote quoteEntity);
	
	
	
}