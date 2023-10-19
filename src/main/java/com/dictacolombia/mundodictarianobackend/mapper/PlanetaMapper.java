package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Planeta;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlanetaMapper {
    Planeta toEntity(PlanetaDto planetaDto);

    PlanetaDto toDto(Planeta planeta);
}
