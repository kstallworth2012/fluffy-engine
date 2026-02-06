package com.insurance.insuranceApplication.services.impl;

import java.util.List;
import java.util.Optional;

import com.insurance.insuranceApplication.domain.Prospect;
import com.insurance.insuranceApplication.services.ProspectService;
import com.insurance.insuranceApplication.repositories.ProspectRepository;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

@Service
public class ProspectServiceImpl implements ProspectService{

	
	private ProspectRepository prospectRepo;
	
	public ProspectServiceImpl(ProspectRepository _prospectRepo) {
		// TODO Auto-generated constructor stub
		this.prospectRepo = _prospectRepo;
	}

	@Override
	public Prospect createProspect(String prospect, Prospect _prospect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prospect> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Prospect> findOne(String _prospect) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String _prospect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Prospect partialUpdate(String prospect_id, Prospect prospectEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String prospect_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Prospect> findAll(Pageable _pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
