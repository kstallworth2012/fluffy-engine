package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.DocumentLibrary;
import com.insurance.insuranceApplication.services.DocumentLibraryService;


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class DocumentLibraryServiceImpl implements DocumentLibraryService{

	@Override
	public DocumentLibrary createDocumentLibrary(String documentLibrary, DocumentLibrary _documentLibrary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentLibrary> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DocumentLibrary> findOne(String _documentLibrary) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _documentLibrary) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DocumentLibrary partialUpdate(String documentLibrary_id, DocumentLibrary documentLibraryEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String documentLibrary_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<DocumentLibrary> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
