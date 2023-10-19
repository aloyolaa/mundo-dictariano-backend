package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaDto;

import java.util.List;

public interface PlanetaService {
    List<PlanetaDto> getBySistemaPlanetario(String sistemaPlanetarioId);
}
