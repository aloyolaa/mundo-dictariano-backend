package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "categoria_usuario")
public class CategoriaUsuario {
    @Id
    private String id;

    private String nombre;
}
