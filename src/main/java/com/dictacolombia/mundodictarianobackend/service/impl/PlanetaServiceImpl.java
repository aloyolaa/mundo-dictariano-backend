package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataAccessExceptionImpl;
import com.dictacolombia.mundodictarianobackend.mapper.PlanetaMapper;
import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaDto;
import com.dictacolombia.mundodictarianobackend.repository.PlanetaRepository;
import com.dictacolombia.mundodictarianobackend.service.PlanetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanetaServiceImpl implements PlanetaService {
    private final PlanetaRepository planetaRepository;
    private final PlanetaMapper planetaMapper;

    @Override
    public List<PlanetaDto> getBySistemaPlanetario(String sistemaPlanetarioId) {
        try {
            return planetaRepository.getBySistemaPlanetario(sistemaPlanetarioId)
                    .stream()
                    .map(planetaMapper::toDto)
                    .toList();
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
