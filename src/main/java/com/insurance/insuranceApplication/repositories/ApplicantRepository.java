package com.insurance.insuranceApplication.repositories;

import com.insurance.insuranceApplication.domain.Applicant;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApplicantRepository extends CrudRepository<Applicant,Long>{

    
}