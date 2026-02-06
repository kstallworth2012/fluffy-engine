package com.insurance.insuranceApplication.repositories;

 import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;
 import com.insurance.insuranceApplication.domain.CommercialContact;

@Repository
public interface CommercialContactRepository extends CrudRepository<CommercialContact,Long>{}