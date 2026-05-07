package com.seuprojeto.api_pix.dto;

import com.seuprojeto.api_pix.service.PagamentoService;

import java.math.BigDecimal;

public class PagamentoRequest {
    private BigDecimal valor;
    private String nomePagador;
    private String nomeDestinatario;

    public PagamentoRequest(){

    }

    public PagamentoRequest(BigDecimal valor, String nomePagador, String nomeDestinatario) {
        this.valor = valor;
        this.nomePagador = nomePagador;
        this.nomeDestinatario = nomeDestinatario;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }
}
