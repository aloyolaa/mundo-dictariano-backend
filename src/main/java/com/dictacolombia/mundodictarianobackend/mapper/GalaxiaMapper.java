package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.GalaxiaDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Galaxia;
import org.springframework.stereotype.Service;

@Service
public class GalaxiaMapper {
    public GalaxiaDto toGalaxiaDto(Galaxia galaxia) {
        return new GalaxiaDto(
                galaxia.getId(),
                galaxia.getNombre()
        );
    }
}
