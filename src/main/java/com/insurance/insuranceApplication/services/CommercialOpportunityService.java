package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.CommercialOpportunity;

public interface CommercialOpportunityService{
	
	CommercialOpportunity createCommercialOpportunity(String CommercialOpportunity, CommercialOpportunity _commercialOpportunity);
    
    List<CommercialOpportunity> findAll();

    Optional<CommercialOpportunity> findOne(String _commercialOpportunity);
    
    Page<CommercialOpportunity> findAll(Pageable _pageable);

	
	boolean isExists(String _commercialOpportunity);


	CommercialOpportunity partialUpdate(String CommercialOpportunity_id, CommercialOpportunity commercialOpportunityEntity );

	void delete(String commercialOpportunity_id);
	
	
}