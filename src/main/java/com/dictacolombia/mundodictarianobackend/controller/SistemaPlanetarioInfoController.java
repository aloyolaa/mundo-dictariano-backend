package com.dictacolombia.mundodictarianobackend.controller;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioInfoDto;
import com.dictacolombia.mundodictarianobackend.service.SistemaPlanetarioInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sistema-planetario-info")
@CrossOrigin(origins = "*")
public class SistemaPlanetarioInfoController {
    private final SistemaPlanetarioInfoService sistemaPlanetarioInfoService;

    @GetMapping("/sistema-planetario-categoria-usuario/{sistemaPlanetarioId}/{categoriaUsuarioId}")
    public ResponseEntity<SistemaPlanetarioInfoDto> getBySistemaPlanetarioAndCategoriaUsuario(@PathVariable String sistemaPlanetarioId,
                                                                                              @PathVariable String categoriaUsuarioId) {
        return new ResponseEntity<>(sistemaPlanetarioInfoService
                .getBySistemaPlanetarioAndCategoriaUsuario(sistemaPlanetarioId, categoriaUsuarioId), HttpStatus.OK);
    }
}
