package com.insurance.insuranceApplication.services;

import java.util.List;
import java.util.Optional;
import com.insurance.insuranceApplication.domain.Prospect;

public interface ProspectService{
	
	
	Prospect createProspect(String prospect, Prospect _prospect);
    
    List<Prospect> findAll();

    Optional<Prospect> findOne(String _prospect);
	
	boolean isExists(String _prospect);


	Prospect partialUpdate(String prospect_id, Prospect prospectEntity );

	void delete(String prospect_id);
	
	
}