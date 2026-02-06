package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.Policy;


public interface PolicyService{
	
	
	
	Policy createPolicy(String policy, Policy _policy);
    
    List<Policy> findAll();

    Optional<Policy> findOne(String _policy);
	
	boolean isExists(String _policy);


	Policy partialUpdate(String policy_id, Policy policyEntity );

	void delete(String policy_id);
	
	
	
}