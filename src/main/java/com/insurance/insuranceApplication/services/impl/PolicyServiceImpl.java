package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Policy;
import com.insurance.insuranceApplication.services.PolicyService;

public class PolicyServiceImpl implements PolicyService{

	public PolicyServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Policy createPolicy(String policy, Policy _policy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Policy> findOne(String _policy) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _policy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Policy partialUpdate(String policy_id, Policy policyEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String policy_id) {
		// TODO Auto-generated method stub
		
	}

}
