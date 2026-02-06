package com.insurance.insuranceApplication.services;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.Applicant;



public interface ApplicantService{
	
	
	Applicant createApplicant(String Applicant, Applicant _applicant);
    
    List<Applicant> findAll();

    Optional<Applicant> findOne(String _applicant);
    
    Page<Applicant> findAll(Pageable _pageable);

	
	boolean isExists(String _applicant);


	Applicant partialUpdate(String applicant_id, Applicant applicantEntity );

	void delete(String applicant_id);
	
	
	
	
	
	
	
}