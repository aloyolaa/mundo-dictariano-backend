package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataAccessExceptionImpl;
import com.dictacolombia.mundodictarianobackend.exception.DataNotFound;
import com.dictacolombia.mundodictarianobackend.mapper.SistemaPlanetarioInfoMapper;
import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioInfoDto;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetarioInfo;
import com.dictacolombia.mundodictarianobackend.repository.SistemaPlanetarioInfoRepository;
import com.dictacolombia.mundodictarianobackend.service.SistemaPlanetarioInfoService;
import com.dictacolombia.mundodictarianobackend.service.SistemaPlanetarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SistemaPlanetarioInfoServiceImpl implements SistemaPlanetarioInfoService {
    private final SistemaPlanetarioInfoRepository sistemaPlanetarioInfoRepository;
    private final SistemaPlanetarioService sistemaPlanetarioService;
    private final SistemaPlanetarioInfoMapper sistemaPlanetarioInfoMapper;

    @Override
    public SistemaPlanetarioInfoDto getBySistemaPlanetarioAndCategoriaUsuario(String sistemaPlanetarioId, String categoriaUsuarioId) {
        try {
            SistemaPlanetario sistemaPlanetario = sistemaPlanetarioService.getOne(sistemaPlanetarioId);
            SistemaPlanetarioInfo sistemaPlanetarioInfo = sistemaPlanetarioInfoRepository
                    .getBySistemaPlanetarioAndCategoriaUsuario(sistemaPlanetarioId, categoriaUsuarioId)
                    .orElseThrow(DataNotFound::new);
            return sistemaPlanetarioInfoMapper.toSistemaPlanetarioInfoDto(sistemaPlanetarioInfo, sistemaPlanetario);
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
