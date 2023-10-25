package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

public record PlanetaDto(
        String id,
        String nombre,
        String textura
) implements Serializable {
}
