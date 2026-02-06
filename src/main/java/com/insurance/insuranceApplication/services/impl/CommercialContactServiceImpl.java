package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.CommercialContact;
import com.insurance.insuranceApplication.services.CommercialContactService;
import com.insurance.insuranceApplication.repositories.CommercialContactRepository;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class CommercialContactServiceImpl implements CommercialContactService{

	
	
	private CommercialContactRepository commercialContactRepository; 
	
	
	
	
	
	public CommercialContactServiceImpl(CommercialContactRepository _commercialContactRepository) {
		super();
		this.commercialContactRepository = _commercialContactRepository;
	}

	@Override
	public CommercialContact createCommercialContact(String commercialContact, CommercialContact _commercialContact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommercialContact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CommercialContact> findOne(String _commercialContact) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _commercialContact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommercialContact partialUpdate(String commercialContact_id, CommercialContact commercialContactEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String commercialContact_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<CommercialContact> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
