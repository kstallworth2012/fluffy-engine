package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Document;
import com.insurance.insuranceApplication.services.DocumentService;


import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService{

	@Override
	public Document createDocument(String document, Document _document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Document> findOne(String _document) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Document partialUpdate(String Document_id, Document documentEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String document_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Document> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
