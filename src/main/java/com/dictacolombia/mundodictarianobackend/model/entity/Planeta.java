package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "planeta")
public class Planeta {
    @Id
    private String id;

    private String nombre;

    private String textura;

    private String sistemaPlanetarioId;
}
