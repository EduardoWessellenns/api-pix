package com.seuprojeto.api_pix.dto;

import com.seuprojeto.api_pix.domain.StatusPagamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PagamentoResponse {
    private UUID id;
    private BigDecimal valor;
    private String nomePagador;
    private String nomeDestinatario;
    private StatusPagamento status;
    private LocalDateTime dataCriacao;

    public PagamentoResponse(){

    }

    public PagamentoResponse(UUID id, BigDecimal valor, String nomePagador,
                             String nomeDestinatario, StatusPagamento status, LocalDateTime dataCriacao) {
        this.id = id;
        this.valor = valor;
        this.nomePagador = nomePagador;
        this.nomeDestinatario = nomeDestinatario;
        this.status = status;
        this.dataCriacao = dataCriacao;
    }

    public UUID getId() {
        return id;
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

    public StatusPagamento getStatus() {
        return status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
