package com.insurance.insuranceApplication.services;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.Opportunity;


public interface OpportunityService{
	
	
	
	Opportunity createOpportunity(String Opportunity, Opportunity _opportunity);
    
    List<Opportunity> findAll();

    Optional<Opportunity> findOne(String _opportunity);
    
    Page<Opportunity> findAll(Pageable _pageable);

	
	boolean isExists(String _opportunity);


	Opportunity partialUpdate(String opportunity_id, Opportunity opportunityEntity );

	void delete(String opportunity_id);

	Opportunity save(Opportunity opportunityEntity);
	
}