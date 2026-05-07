package com.seuprojeto.api_pix.controller;

import com.seuprojeto.api_pix.service.PagamentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    private final PagamentoService service;

    public PagamentoController(PagamentoService service) {
        this.service = service;
    }
}
