package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CommercialOpportunityRepository extends CrudRepository<CommercialOpportunity,Long>{}