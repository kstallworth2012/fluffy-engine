package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.CommercialApplication;

public interface CommercialApplicantService{
	
	CommercialApplication createCommercialApplication(String commercialApplication, CommercialApplication _commercialApplication);
    
    List<CommercialApplication> findAll();

    Optional<CommercialApplication> findOne(String _commercialApplication);
	
	boolean isExists(String _commercialApplication);


	CommercialApplication partialUpdate(String commercialApplication_id, CommercialApplication commercialApplicationEntity );

	void delete(String commercialApplication_id);
	
	
	
	
	
}