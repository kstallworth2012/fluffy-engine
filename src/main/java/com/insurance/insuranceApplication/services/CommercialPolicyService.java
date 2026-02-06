package com.insurance.insuranceApplication.services;


import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.CommercialPolicy;

public interface CommercialPolicyService{
	
	CommercialPolicy createCommercialPolicy(String commercialPolicy, CommercialPolicy _commercialPolicy);
    
    List<CommercialPolicy> findAll();

    Optional<CommercialPolicy> findOne(String _commercialPolicy);
	
	boolean isExists(String _commercialPolicy);


	CommercialPolicy partialUpdate(String commercialPolicy_id, CommercialPolicy commercialPolicyEntity );

	void delete(String commercialPolicy_id);
	
	
	
}