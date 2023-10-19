package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioDto;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SistemaPlanetarioMapper {
    SistemaPlanetario toEntity(SistemaPlanetarioDto sistemaPlanetarioDto);

    SistemaPlanetarioDto toDto(SistemaPlanetario sistemaPlanetario);
}
