package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "galaxia")
public class Galaxia {
    @Id
    private String id;

    private String nombre;
}
