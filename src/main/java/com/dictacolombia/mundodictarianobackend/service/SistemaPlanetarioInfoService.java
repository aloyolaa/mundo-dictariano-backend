package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioInfoDto;

public interface SistemaPlanetarioInfoService {
    SistemaPlanetarioInfoDto getBySistemaPlanetarioAndCategoriaUsuario(String sistemaPlanetarioId, String categoriaUsuarioId);
}
