package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.CommercialProspect;


public interface CommercialProspectService{
	
	CommercialProspect createCommercialProspect(String commercialProspect, CommercialProspect _commercialProspect);
    
    List<CommercialProspect> findAll();

    Optional<CommercialProspect> findOne(String _commercialProspect);
	
	boolean isExists(String _commercialProspect);


	CommercialProspect partialUpdate(String commercialProspect_id, CommercialProspect commercialProspectEntity );

	void delete(String commercialProspect_id);
	
	
}