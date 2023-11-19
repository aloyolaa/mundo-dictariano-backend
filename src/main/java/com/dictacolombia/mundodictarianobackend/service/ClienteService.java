package com.dictacolombia.mundodictarianobackend.service;

import com.dictacolombia.mundodictarianobackend.model.dto.ClienteDto;
import com.dictacolombia.mundodictarianobackend.model.dto.CredencialesDto;

public interface ClienteService {
    ClienteDto login(CredencialesDto credentialsDto);

    ClienteDto getByLogin(String login);
}
