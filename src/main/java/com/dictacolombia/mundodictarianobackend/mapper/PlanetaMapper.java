package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Planeta;
import org.springframework.stereotype.Service;

@Service
public class PlanetaMapper {
    public PlanetaDto toPlanetaDto(Planeta planeta) {
        return new PlanetaDto(
                planeta.getId(),
                planeta.getNombre(),
                planeta.getTextura()
        );
    }
}
