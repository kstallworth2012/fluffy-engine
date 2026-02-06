package com.insurance.insuranceApplication.repositories;

 import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;
 import com.insurance.insuranceApplication.domain.Quote;


 @Repository
public interface QuoteRepository extends CrudRepository<Quote,Long>{}