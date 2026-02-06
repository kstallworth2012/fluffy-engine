package com.insurance.insuranceApplication.repositories;

 import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;
 import com.insurance.insuranceApplication.domain.Prospect;

@Repository
public interface ProspectRepository extends CrudRepository<Prospect,Long>{}