package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;
import java.util.List;

public record PlanetaInfoDto(
        String id,
        String descripcion,
        String landingPage,
        String planeta,
        List<AtributoNivelDto> atributos
) implements Serializable {
}
