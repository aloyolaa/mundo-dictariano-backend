package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.Galaxia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GalaxiaRepository extends MongoRepository<Galaxia, String> {
}
