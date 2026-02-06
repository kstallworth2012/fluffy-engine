package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.CommercialApplication;

public interface CommercialApplicantService{
	
	CommercialApplication createCommercialApplication(String commercialApplication, CommercialApplication _commercialApplication);
    
    List<CommercialApplication> findAll();

    Optional<CommercialApplication> findOne(String _commercialApplication);
    
    Page<CommercialApplication> findAll(Pageable _pageable);

	
	boolean isExists(String _commercialApplication);


	CommercialApplication partialUpdate(String commercialApplication_id, CommercialApplication commercialApplicationEntity );

	void delete(String commercialApplication_id);
	
	
	
	
	
}