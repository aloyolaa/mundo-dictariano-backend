package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "sistema_planetario_info")
public class SistemaPlanetarioInfo {
    @Id
    private String id;

    private String reto;

    private String acierto;

    private String riesgos;

    private String sistemaPlanetarioId;

    private String categoriaUsuarioId;
}
