package com.insurance.insuranceApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialContactRepository extends CrudRepository<CommercialContact,Long>{}