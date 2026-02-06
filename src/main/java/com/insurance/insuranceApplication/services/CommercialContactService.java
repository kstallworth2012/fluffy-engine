package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.CommercialContact;

public interface CommercialContactService{
	
	
	
	CommercialContact createCommercialContact(String commercialContact, CommercialContact _commercialContact);
    
    List<CommercialContact> findAll();

    Optional<CommercialContact> findOne(String _commercialContact);
    
    Page<CommercialContact> findAll(Pageable _pageable);

	
	boolean isExists(String _commercialContact);


	CommercialContact partialUpdate(String commercialContact_id, CommercialContact commercialContactEntity );

	void delete(String commercialContact_id);
}