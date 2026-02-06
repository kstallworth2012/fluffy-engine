package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.Document;

public interface DocumentService{
	
	
	Document createDocument(String document, Document _document);
    
    List<Document> findAll();

    Optional<Document> findOne(String _document);
	
	boolean isExists(String _document);


	Document partialUpdate(String Document_id, Document documentEntity );

	void delete(String document_id);
	
}