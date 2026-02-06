package com.insurance.insuranceApplication.repositories;

 import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;
 import com.insurance.insuranceApplication.domain.CommercialPolicy;


@Repository
public interface CommercialPolicyRepository extends CrudRepository<CommercialPolicy,Long>{}