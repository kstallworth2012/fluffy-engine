package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Applicant;
import com.insurance.insuranceApplication.services.ApplicantService;
import com.insurance.insuranceApplication.repositories.ApplicantRepository;


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	
	private ApplicantRepository applicantRepository; 
	
	public ApplicantServiceImpl(ApplicantRepository _applicantRepository) {
		super();
		this.applicantRepository = _applicantRepository;
	}

	@Override
	public Applicant createApplicant(String Applicant, Applicant _applicant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Applicant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Applicant> findOne(String _applicant) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _applicant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Applicant partialUpdate(String applicant_id, Applicant applicantEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String applicant_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Applicant> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
