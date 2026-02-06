package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Contact;
import com.insurance.insuranceApplication.services.ContactService;

public class ContactServiceImpl implements ContactService{

	@Override
	public Contact createContact(String contact, Contact _contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Contact> findOne(String _contact) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact partialUpdate(String contact_id, Contact contactEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String contact_id) {
		// TODO Auto-generated method stub
		
	}

}
