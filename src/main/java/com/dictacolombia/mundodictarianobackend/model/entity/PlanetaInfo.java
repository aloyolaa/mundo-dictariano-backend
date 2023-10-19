package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "planeta_info")
public class PlanetaInfo {
    @Id
    private String id;

    private String descripcion;

    private String landingPage;

    @Field(name = "planeta_id")
    private String planetaId;

    @Field(name = "categoria_usuario_id")
    private String categoriaUsuarioId;
}
