package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.dictacolombia.mundodictarianobackend.model.entity.PlanetaInfo}
 */
public record PlanetaInfoDto(
        String id,
        String descripcion,
        String landingPage
) implements Serializable {
}
