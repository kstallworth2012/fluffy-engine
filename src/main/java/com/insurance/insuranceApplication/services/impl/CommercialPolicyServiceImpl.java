package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.CommercialPolicy;
import com.insurance.insuranceApplication.services.CommercialPolicyService;
import com.insurance.insuranceApplication.repositories.CommercialPolicyRepository;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class CommercialPolicyServiceImpl implements CommercialPolicyService{

	
	private CommercialPolicyRepository commercialPolicyRepo;
	
	public CommercialPolicyServiceImpl(CommercialPolicyRepository _commercialPolicyRepo) {
		super();
		this.commercialPolicyRepo = _commercialPolicyRepo;
	}

	@Override
	public CommercialPolicy createCommercialPolicy(String commercialPolicy, CommercialPolicy _commercialPolicy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommercialPolicy> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CommercialPolicy> findOne(String _commercialPolicy) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _commercialPolicy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommercialPolicy partialUpdate(String commercialPolicy_id, CommercialPolicy commercialPolicyEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String commercialPolicy_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<CommercialPolicy> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
