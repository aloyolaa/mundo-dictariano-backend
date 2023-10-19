package com.dictacolombia.mundodictarianobackend.exception;

public class DataNotFound extends RuntimeException {
    public DataNotFound() {
        super("Datos no encontrados.");
    }
}
