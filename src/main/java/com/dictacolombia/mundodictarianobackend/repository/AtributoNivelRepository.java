package com.dictacolombia.mundodictarianobackend.repository;

import com.dictacolombia.mundodictarianobackend.model.entity.AtributoNivel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AtributoNivelRepository extends MongoRepository<AtributoNivel, String> {
    @Query("{ 'planeta_info_id' : ?0, 'atributo_id' : ?1 }")
    List<AtributoNivel> getByPlanetaInfoAndAtributo(String planetaInfoId, String atributoId);
}
