package com.dictacolombia.mundodictarianobackend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ClienteDto {
    private String login;
    private String token;
}
