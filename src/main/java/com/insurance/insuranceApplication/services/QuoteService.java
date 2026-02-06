package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.Quote;

public interface QuoteService{
	
	
	
	
	
	Quote createQuote(String quote, Quote _quote);
    
    List<Quote> findAll();

    Optional<Quote> findOne(String _quote);
	
	boolean isExists(String _quote);


	Quote partialUpdate(String quote_id, Quote quoteEntity );

	void delete(String quote_id);
	
	
	
}