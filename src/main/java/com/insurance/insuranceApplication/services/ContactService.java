package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.Contact;


public interface ContactService{
	
	
	Contact createContact(String contact, Contact _contact);
    
    List<Contact> findAll();

    Optional<Contact> findOne(String _contact);
	
	boolean isExists(String _contact);


	Contact partialUpdate(String contact_id, Contact contactEntity );

	void delete(String contact_id);
	
	
}