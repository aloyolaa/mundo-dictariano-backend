package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetarioInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface SistemaPlanetarioInfoRepository extends MongoRepository<SistemaPlanetarioInfo, String> {
    @Query("{ 'sistemaPlanetarioId' : ?0, 'categoriaUsuarioId' : ?1 }")
    Optional<SistemaPlanetarioInfo> getBySistemaPlanetarioAndCategoriaUsuario(String sistemaPlanetarioId, String categoriaUsuarioId);
}
