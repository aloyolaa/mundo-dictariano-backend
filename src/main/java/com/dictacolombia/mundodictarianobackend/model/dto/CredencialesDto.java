package com.dictacolombia.mundodictarianobackend.model.dto;

import java.io.Serializable;

public record CredencialesDto(
        String login,
        String password
) implements Serializable {
}
