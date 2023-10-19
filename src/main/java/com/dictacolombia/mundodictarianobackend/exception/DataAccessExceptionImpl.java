package com.dictacolombia.mundodictarianobackend.exception;

import org.springframework.dao.DataAccessException;

public class DataAccessExceptionImpl extends DataAccessException {
    public DataAccessExceptionImpl(Throwable cause) {
        super("Error al acceder a los datos. Vuelva a intentarlo más tarde.", cause);
    }
}
