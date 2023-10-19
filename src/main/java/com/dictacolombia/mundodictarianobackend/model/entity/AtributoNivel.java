package com.dictacolombia.mundodictarianobackend.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "atributo_nivel")
public class AtributoNivel {
    @Id
    private String id;

    private Integer nivel;

    @Field(name = "planeta_info_id")
    private String planetaInfoId;

    @Field(name = "atributo_id")
    private String atributoId;
}
