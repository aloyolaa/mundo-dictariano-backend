package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "planeta_info")
public class PlanetaInfo {
    @Id
    private String id;

    private String descripcion;

    private String landingPage;

    private String planetaId;

    private String categoriaUsuarioId;

    private List<AtributoNivel> atributos;
}
