package com.insurance.insuranceApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.insurance.insuranceApplication.domain.Opportunity;

@Repository
public interface OpportunityRepository extends CrudRepository<Opportunity,Long>{}