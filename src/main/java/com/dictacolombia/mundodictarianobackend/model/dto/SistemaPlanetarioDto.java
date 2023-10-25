package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

public record SistemaPlanetarioDto(
        String id,
        String nombre,
        String descripcion
) implements Serializable {
}
