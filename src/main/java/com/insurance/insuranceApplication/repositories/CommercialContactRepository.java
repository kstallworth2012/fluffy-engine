package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialContactRepository extends CrudRepository<CommercialContact,Long>{}