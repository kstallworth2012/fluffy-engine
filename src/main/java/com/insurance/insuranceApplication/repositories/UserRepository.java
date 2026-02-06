package com.insurance.insuranceApplication.repositories;

 import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;
 import com.insurance.insuranceApplication.domain.User;


@Repository
public interface UserRepository extends CrudRepository<User,Long>{}