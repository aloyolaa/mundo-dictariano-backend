package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface SistemaPlanetarioRepository extends MongoRepository<SistemaPlanetario, String> {
    @Query("{ 'galaxia_id' : ?0 }")
    Optional<SistemaPlanetario> getByGalaxia(String galaxiaId);
}
