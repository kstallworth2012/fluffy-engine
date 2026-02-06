package com.insurance.insuranceApplication.services;


import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.Opportunity;


public interface OpportunityService{
	
	
	
	Opportunity createOpportunity(String Opportunity, Opportunity _opportunity);
    
    List<Opportunity> findAll();

    Optional<Opportunity> findOne(String _opportunity);
	
	boolean isExists(String _opportunity);


	Opportunity partialUpdate(String opportunity_id, Opportunity opportunityEntity );

	void delete(String opportunity_id);
	
}