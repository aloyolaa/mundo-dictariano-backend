package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    @Query("{ 'login' : ?0 }")
    Optional<Cliente> getByLogin(String login);
}
