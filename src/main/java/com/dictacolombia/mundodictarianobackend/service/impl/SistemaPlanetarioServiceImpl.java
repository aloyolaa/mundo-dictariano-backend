package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataAccessExceptionImpl;
import com.dictacolombia.mundodictarianobackend.exception.DataNotFound;
import com.dictacolombia.mundodictarianobackend.mapper.SistemaPlanetarioMapper;
import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioDto;
import com.dictacolombia.mundodictarianobackend.repository.SistemaPlanetarioRepository;
import com.dictacolombia.mundodictarianobackend.service.SistemaPlanetarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SistemaPlanetarioServiceImpl implements SistemaPlanetarioService {
    private final SistemaPlanetarioRepository sistemaPlanetarioRepository;
    private final SistemaPlanetarioMapper sistemaPlanetarioMapper;

    @Override
    public SistemaPlanetarioDto getByGalaxia(String galaxiaId) {
        try {
            return sistemaPlanetarioRepository.getByGalaxia(galaxiaId)
                    .map(sistemaPlanetarioMapper::toSistemaPlanetarioDto)
                    .orElseThrow(DataNotFound::new);
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
