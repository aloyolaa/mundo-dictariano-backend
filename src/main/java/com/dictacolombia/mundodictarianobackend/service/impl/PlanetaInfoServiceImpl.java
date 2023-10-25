package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataAccessExceptionImpl;
import com.dictacolombia.mundodictarianobackend.exception.DataNotFound;
import com.dictacolombia.mundodictarianobackend.mapper.PlanetaInfoMapper;
import com.dictacolombia.mundodictarianobackend.model.dto.AtributoNivelDto;
import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaInfoDto;
import com.dictacolombia.mundodictarianobackend.model.entity.AtributoNivel;
import com.dictacolombia.mundodictarianobackend.model.entity.Planeta;
import com.dictacolombia.mundodictarianobackend.model.entity.PlanetaInfo;
import com.dictacolombia.mundodictarianobackend.repository.PlanetaInfoRepository;
import com.dictacolombia.mundodictarianobackend.service.AtributoService;
import com.dictacolombia.mundodictarianobackend.service.PlanetaInfoService;
import com.dictacolombia.mundodictarianobackend.service.PlanetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanetaInfoServiceImpl implements PlanetaInfoService {
    private final PlanetaInfoRepository planetaInfoRepository;
    private final AtributoService atributoService;
    private final PlanetaService planetaService;
    private final PlanetaInfoMapper planetaInfoMapper;

    @Override
    public PlanetaInfoDto getByPlanetaAndCategoriaUsuario(String planetaId, String categoriaUsuarioId) {
        try {
            Planeta planeta = planetaService.getOne(planetaId);
            PlanetaInfo planetaInfo = planetaInfoRepository
                    .getByPlanetaAndCategoriaUsuario(planetaId, categoriaUsuarioId)
                    .orElseThrow(DataNotFound::new);
            List<AtributoNivelDto> atributos = new ArrayList<>();
            for (AtributoNivel atributoNivel : planetaInfo.getAtributos()) {
                AtributoNivelDto atributoNivelDto = new AtributoNivelDto(
                        atributoService.getOne(atributoNivel.getAtributoId()).getNombre(),
                        atributoNivel.getNivel()
                );
                atributos.add(atributoNivelDto);
            }
            return planetaInfoMapper.toPlanetaInfoDto(planetaInfo, planeta, atributos);
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
