package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.PlanetaInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface PlanetaInfoRepository extends MongoRepository<PlanetaInfo, String> {
    @Query("{ 'planetaId' : ?0, 'categoriaUsuarioId' : ?1 }")
    Optional<PlanetaInfo> getByPlanetaAndCategoriaUsuario(String planetaId, String categoriaUsuarioId);
}
