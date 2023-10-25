package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioDto;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario;
import org.springframework.stereotype.Service;

@Service
public class SistemaPlanetarioMapper {
    public SistemaPlanetarioDto toSistemaPlanetarioDto(SistemaPlanetario sistemaPlanetario) {
        return new SistemaPlanetarioDto(
                sistemaPlanetario.getId(),
                sistemaPlanetario.getNombre(),
                sistemaPlanetario.getDescripcion()
        );
    }
}
