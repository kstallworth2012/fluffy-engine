package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Policy;
import com.insurance.insuranceApplication.services.PolicyService;
import com.insurance.insuranceApplication.repositories.PolicyRepository;


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService{

	
	
	private PolicyRepository policyRepo;
	
	public PolicyServiceImpl(PolicyRepository _policyRepo) {
		// TODO Auto-generated constructor stub
		this.policyRepo = _policyRepo;
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

	@Override
	public Page<Policy> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
