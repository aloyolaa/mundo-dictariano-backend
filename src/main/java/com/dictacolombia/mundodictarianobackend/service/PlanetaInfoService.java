package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaInfoDto;

public interface PlanetaInfoService {
   PlanetaInfoDto getByPlanetaAndCategoriaUsuario(String planetaId, String categoriaUsuarioId);
}
