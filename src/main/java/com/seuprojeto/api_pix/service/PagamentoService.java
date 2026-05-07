package com.seuprojeto.api_pix.service;

import com.seuprojeto.api_pix.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    private final PagamentoRepository repository;

    public PagamentoService(PagamentoRepository repository) {
        this.repository = repository;
    }
}
