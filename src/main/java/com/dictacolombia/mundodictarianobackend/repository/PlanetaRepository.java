package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.Planeta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {
    @Query("{ 'sistemaPlanetarioId' : ?0 }")
    List<Planeta> getBySistemaPlanetario(String sistemaPlanetarioId);
}
