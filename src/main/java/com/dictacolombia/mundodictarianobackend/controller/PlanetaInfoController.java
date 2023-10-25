package com.dictacolombia.mundodictarianobackend.controller;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaInfoDto;
import com.dictacolombia.mundodictarianobackend.service.PlanetaInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/planeta-info")
@CrossOrigin(origins = "*")
public class PlanetaInfoController {
    private final PlanetaInfoService planetaInfoService;

    @GetMapping("/planeta-categoria-usuario/{planetaId}/{categoriaUsuarioId}")
    public ResponseEntity<PlanetaInfoDto> getByPlanetaAndCategoriaUsuario(@PathVariable String planetaId, @PathVariable String categoriaUsuarioId) {
        return new ResponseEntity<>(planetaInfoService.getByPlanetaAndCategoriaUsuario(planetaId, categoriaUsuarioId), HttpStatus.OK);
    }
}
