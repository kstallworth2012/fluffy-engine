package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.CommercialOpportunity;
import com.insurance.insuranceApplication.services.CommercialOpportunityService;
//import com.insurance.insuranceApplication.repositories.

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class CommercialOpportunityServiceImpl implements CommercialOpportunityService{

	@Override
	public CommercialOpportunity createCommercialOpportunity(String CommercialOpportunity,
			CommercialOpportunity _commercialOpportunity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommercialOpportunity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CommercialOpportunity> findOne(String _commercialOpportunity) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _commercialOpportunity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommercialOpportunity partialUpdate(String CommercialOpportunity_id,
			CommercialOpportunity commercialOpportunityEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String commercialOpportunity_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<CommercialOpportunity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
