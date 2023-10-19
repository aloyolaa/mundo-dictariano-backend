package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

public record GalaxiaDto(
        String id,
        String nombre
) implements Serializable {
}
