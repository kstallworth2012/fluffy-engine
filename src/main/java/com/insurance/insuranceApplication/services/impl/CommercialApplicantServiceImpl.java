package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.CommercialApplication;
import com.insurance.insuranceApplication.services.CommercialApplicantService;
//import com.insurance.insuranceApplication.repositories.


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class CommercialApplicantServiceImpl implements CommercialApplicantService{

	
	  
	public CommercialApplicantServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CommercialApplication createCommercialApplication(String commercialApplication,
			CommercialApplication _commercialApplication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommercialApplication> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CommercialApplication> findOne(String _commercialApplication) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _commercialApplication) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommercialApplication partialUpdate(String commercialApplication_id,
			CommercialApplication commercialApplicationEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String commercialApplication_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<CommercialApplication> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
