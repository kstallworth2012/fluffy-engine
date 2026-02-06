package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Quote;
import com.insurance.insuranceApplication.services.QuoteService;
import com.insurance.insuranceApplication.repositories.QuoteRepository;


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService{

	
	private QuoteRepository quoteRepo;
	
	
	
	
	public QuoteServiceImpl(QuoteRepository _quoteRepo) {
		super();
		this.quoteRepo = _quoteRepo;
	}

	public QuoteServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Quote createQuote(String quote, Quote _quote) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quote> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Quote> findOne(String _quote) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _quote) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Quote partialUpdate(String quote_id, Quote quoteEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String quote_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Quote> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
