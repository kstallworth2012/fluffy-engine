package com.project.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectRepository extends CrudRepository<Prospect,Long>{}