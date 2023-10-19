package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario}
 */
public record SistemaPlanetarioDto(
        String id,
        String nombre,
        String descripcion
) implements Serializable {
}
