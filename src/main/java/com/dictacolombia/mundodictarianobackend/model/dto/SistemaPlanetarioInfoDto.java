package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

public record SistemaPlanetarioInfoDto(
        String id,
        String descripcion,
        String reto,
        String acierto,
        String riesgos,
        String sistemaPlanetario
) implements Serializable {
}
