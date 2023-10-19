package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.PlanetaInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlanetaInfoRepository extends MongoRepository<PlanetaInfo, String> {
    @Query("{ 'planeta_id' : ?0, 'categoria_usuario_id' : ?1 }")
    List<PlanetaInfo> getByPlanetaAndCategoriaUsuario(String planetaId, String categoriaUsuarioId);
}
