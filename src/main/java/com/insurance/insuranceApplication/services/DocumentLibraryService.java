package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;


import com.insurance.insuranceApplication.domain.DocumentLibrary;

public interface DocumentLibraryService{
	
	
	
	DocumentLibrary createDocumentLibrary(String documentLibrary, DocumentLibrary _documentLibrary);
    
    List<DocumentLibrary> findAll();

    Optional<DocumentLibrary> findOne(String _documentLibrary);
	
	boolean isExists(String _documentLibrary);


	DocumentLibrary partialUpdate(String documentLibrary_id, DocumentLibrary documentLibraryEntity );

	void delete(String documentLibrary_id);
	
	
	
	
}