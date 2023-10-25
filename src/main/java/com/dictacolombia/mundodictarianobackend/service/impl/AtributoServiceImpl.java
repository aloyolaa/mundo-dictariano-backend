package com.dictacolombia.mundodictarianobackend.service.impl;

import com.dictacolombia.mundodictarianobackend.exception.DataAccessExceptionImpl;
import com.dictacolombia.mundodictarianobackend.exception.DataNotFound;
import com.dictacolombia.mundodictarianobackend.model.entity.Atributo;
import com.dictacolombia.mundodictarianobackend.repository.AtributoRepository;
import com.dictacolombia.mundodictarianobackend.service.AtributoService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AtributoServiceImpl implements AtributoService {
    private final AtributoRepository atributoRepository;

    @Override
    public Atributo getOne(String id) {
        try {
            return atributoRepository.findById(id)
                    .orElseThrow(DataNotFound::new);
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl(e);
        }
    }
}
