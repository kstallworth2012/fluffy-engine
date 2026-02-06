package com.insurance.insuranceApplication.services;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.CommercialPolicy;

public interface CommercialPolicyService{
	
	CommercialPolicy createCommercialPolicy(String commercialPolicy, CommercialPolicy _commercialPolicy);
    
    List<CommercialPolicy> findAll();

    Optional<CommercialPolicy> findOne(String _commercialPolicy);
    
    Page<CommercialPolicy> findAll(Pageable _pageable);

	
	boolean isExists(String _commercialPolicy);


	CommercialPolicy partialUpdate(String commercialPolicy_id, CommercialPolicy commercialPolicyEntity );

	void delete(String commercialPolicy_id);
	
	
	
}