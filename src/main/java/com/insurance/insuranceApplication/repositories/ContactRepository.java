package com.insurance.insuranceApplication.repositories;

 import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;
 import  com.insurance.insuranceApplication.domain.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long>{}