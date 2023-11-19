package com.dictacolombia.mundodictarianobackend.mapper;

import com.dictacolombia.mundodictarianobackend.model.dto.ClienteDto;
import com.dictacolombia.mundodictarianobackend.model.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteMapper {
    public ClienteDto toClienteDto(Cliente cliente) {
        return new ClienteDto(cliente.getLogin(), cliente.getPassword());
    }
}
