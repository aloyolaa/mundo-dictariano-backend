package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.Atributo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AtributoRepository extends MongoRepository<Atributo, String> {
}
