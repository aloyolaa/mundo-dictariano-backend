package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

public record AtributoNivelDto(
        String atributo,
        Integer nivel
) implements Serializable {
}
