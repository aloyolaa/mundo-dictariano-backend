package com.dictacolombia.mundodictarianobackend.controller;

import com.dictacolombia.mundodictarianobackend.configuration.ClienteAuthenticationProvider;
import com.dictacolombia.mundodictarianobackend.model.dto.ClienteDto;
import com.dictacolombia.mundodictarianobackend.model.dto.CredencialesDto;
import com.dictacolombia.mundodictarianobackend.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final ClienteService clientService;
    private final ClienteAuthenticationProvider clientAuthenticationProvider;

    @PostMapping("/login")
    public ResponseEntity<ClienteDto> login(@RequestBody CredencialesDto credentialsDto) {
        ClienteDto clienteDto = clientService.login(credentialsDto);
        clienteDto.setToken(clientAuthenticationProvider.createToken(clienteDto));
        return ResponseEntity.ok(clienteDto);
    }
}
