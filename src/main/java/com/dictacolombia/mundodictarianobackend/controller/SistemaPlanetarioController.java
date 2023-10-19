package com.dictacolombia.mundodictarianobackend.controller;

import com.dictacolombia.mundodictarianobackend.model.dto.SistemaPlanetarioDto;
import com.dictacolombia.mundodictarianobackend.service.SistemaPlanetarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sistema-planetario")
public class SistemaPlanetarioController {
    private final SistemaPlanetarioService sistemaPlanetarioService;

    @GetMapping("/galaxia/{galaxiaId}")
    public ResponseEntity<SistemaPlanetarioDto> getByGalaxia(@PathVariable String galaxiaId) {
        return new ResponseEntity<>(sistemaPlanetarioService.getByGalaxia(galaxiaId), HttpStatus.OK);
    }
}
