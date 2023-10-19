package com.dictacolombia.mundodictarianobackend.controller;

import com.dictacolombia.mundodictarianobackend.model.dto.PlanetaDto;
import com.dictacolombia.mundodictarianobackend.service.PlanetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/planeta")
@CrossOrigin(origins = "*")
public class PlanetaController {
    private final PlanetaService planetaService;

    @GetMapping("/sistema-planetario/{sistemaPlanetarioId}")
    public ResponseEntity<List<PlanetaDto>> getBySistemaPlanetario(@PathVariable String sistemaPlanetarioId) {
        return new ResponseEntity<>(planetaService.getBySistemaPlanetario(sistemaPlanetarioId), HttpStatus.OK);
    }
}
