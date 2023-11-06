package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioInfoDto;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetarioInfo;
import org.springframework.stereotype.Service;

@Service
public class SistemaPlanetarioInfoMapper {
    public SistemaPlanetarioInfoDto toSistemaPlanetarioInfoDto(SistemaPlanetarioInfo sistemaPlanetarioInfo, SistemaPlanetario sistemaPlanetario) {
        return new SistemaPlanetarioInfoDto(
                sistemaPlanetarioInfo.getId(),
                sistemaPlanetario.getDescripcion(),
                sistemaPlanetarioInfo.getReto(),
                sistemaPlanetarioInfo.getAcierto(),
                sistemaPlanetarioInfo.getRiesgos(),
                sistemaPlanetario.getNombre()
        );
    }
}
