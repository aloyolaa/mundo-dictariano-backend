package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.GalaxiaDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Galaxia;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GalaxiaMapper {
    Galaxia toEntity(GalaxiaDto galaxiaDto);

    GalaxiaDto toDto(Galaxia galaxia);
}
