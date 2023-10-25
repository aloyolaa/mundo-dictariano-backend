package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.AtributoNivelDto;
import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaInfoDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Planeta;
import com.dictacolombia.mundodictarianobackend.model.entity.PlanetaInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaInfoMapper {
    public PlanetaInfoDto toPlanetaInfoDto(PlanetaInfo planetaInfo, Planeta planeta, List<AtributoNivelDto> atributos) {
        return new PlanetaInfoDto(
                planetaInfo.getId(),
                planetaInfo.getDescripcion(),
                planetaInfo.getLandingPage(),
                planeta.getNombre(),
                atributos
        );
    }
}
