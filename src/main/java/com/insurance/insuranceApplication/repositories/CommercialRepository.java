package com.insurance.insuranceApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface extends CrudRepository<Message,Long>{}