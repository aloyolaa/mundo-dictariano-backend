package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioDto;
import com.dictacolombia.mundodictarianobackend.model.entity.SistemaPlanetario;

public interface SistemaPlanetarioService {
    SistemaPlanetario getOne(String id);

    SistemaPlanetarioDto getByGalaxia(String galaxiaId);
}
