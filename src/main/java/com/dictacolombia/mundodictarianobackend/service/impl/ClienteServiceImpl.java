package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataNotFound;
import com.dictacolombia.mundodictarianobackend.mapper.ClienteMapper;
import com.dictacolombia.mundodictarianobackend.model.dto.ClienteDto;
import com.dictacolombia.mundodictarianobackend.model.dto.CredencialesDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Cliente;
import com.dictacolombia.mundodictarianobackend.repository.ClienteRepository;
import com.dictacolombia.mundodictarianobackend.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public ClienteDto login(CredencialesDto credentialsDto) {
        Cliente cliente = clienteRepository.getByLogin(credentialsDto.login())
                .orElseThrow(DataNotFound::new);

        if (passwordEncoder.matches(credentialsDto.password(), cliente.getPassword())) {
            return clienteMapper.toClienteDto(cliente);
        }
        throw new RuntimeException("Password Inválido");
    }

    @Override
    public ClienteDto getByLogin(String login) {
        Cliente cliente = clienteRepository.getByLogin(login)
                .orElseThrow(DataNotFound::new);
        return clienteMapper.toClienteDto(cliente);
    }
}
