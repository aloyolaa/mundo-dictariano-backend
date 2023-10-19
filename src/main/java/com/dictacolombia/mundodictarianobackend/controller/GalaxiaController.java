package com.dictacolombia.mundodictarianobackend.controller;

import com.dictacolombia.mundodictarianobackend.model.dto.GalaxiaDto;
import com.dictacolombia.mundodictarianobackend.service.GalaxiaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/galaxia")
public class GalaxiaController {
    private final GalaxiaService galaxiaService;

    @GetMapping("/")
    public ResponseEntity<List<GalaxiaDto>> getAll() {
        return new ResponseEntity<>(galaxiaService.getAll(), HttpStatus.OK);
    }
}
