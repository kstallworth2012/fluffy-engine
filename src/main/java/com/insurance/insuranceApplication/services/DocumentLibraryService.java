package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.insurance.insuranceApplication.domain.DocumentLibrary;

public interface DocumentLibraryService{
	
	
	
	DocumentLibrary createDocumentLibrary(String documentLibrary, DocumentLibrary _documentLibrary);
    
    List<DocumentLibrary> findAll();

    Optional<DocumentLibrary> findOne(String _documentLibrary);
    
    Page<DocumentLibrary> findAll(Pageable _pageable);

	
	boolean isExists(String _documentLibrary);


	DocumentLibrary partialUpdate(String documentLibrary_id, DocumentLibrary documentLibraryEntity );

	void delete(String documentLibrary_id);
	
	
	
	
}