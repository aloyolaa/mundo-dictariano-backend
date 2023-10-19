package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.dictacolombia.mundodictarianobackend.model.entity.Planeta}
 */
public record PlanetaDto(
        String id,
        String nombres,
        String textura
) implements Serializable {
}
