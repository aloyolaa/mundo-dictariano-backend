package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioDto;

public interface SistemaPlanetarioService {
    SistemaPlanetarioDto getByGalaxia(String galaxiaId);
}
