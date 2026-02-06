package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Opportunity;
import com.insurance.insuranceApplication.services.OpportunityService;


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class OpportunityServiceImpl implements OpportunityService{

	@Override
	public Opportunity createOpportunity(String Opportunity, Opportunity _opportunity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Opportunity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Opportunity> findOne(String _opportunity) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _opportunity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Opportunity partialUpdate(String opportunity_id, Opportunity opportunityEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String opportunity_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Opportunity> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
