package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataAccessExceptionImpl;
import com.dictacolombia.mundodictarianobackend.mapper.GalaxiaMapper;
import com.dictacolombia.mundodictarianobackend.model.dto.GalaxiaDto;
import com.dictacolombia.mundodictarianobackend.repository.GalaxiaRepository;
import com.dictacolombia.mundodictarianobackend.service.GalaxiaService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GalaxiaServiceImpl implements GalaxiaService {
    private final GalaxiaRepository galaxiaRepository;
    private final GalaxiaMapper galaxiaMapper;

    @Override
    public List<GalaxiaDto> getAll() {
        try {
            return galaxiaRepository.findAll()
                    .stream()
                    .map(galaxiaMapper::toDto)
                    .toList();
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
