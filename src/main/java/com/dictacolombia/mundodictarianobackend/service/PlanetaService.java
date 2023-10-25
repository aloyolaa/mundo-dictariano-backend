package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Planeta;

import java.util.List;

public interface PlanetaService {
    Planeta getOne(String id);

    List<PlanetaDto> getBySistemaPlanetario(String sistemaPlanetarioId);
}
