package com.demo.testUnit.domain.repository;

import com.demo.testUnit.domain.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
