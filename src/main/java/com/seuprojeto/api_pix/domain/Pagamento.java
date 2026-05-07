package com.seuprojeto.api_pix.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private BigDecimal valor;
    private LocalDateTime dataCriacao;
    private String nomePagador;
    private String nomeDestinatario;

    @Enumerated(EnumType.STRING)
    private StatusPagamento status;

    public Pagamento(){

    }

    public Pagamento(UUID id, BigDecimal valor, LocalDateTime dataCriacao, String nomePagador,
                     String nomeDestinatario, StatusPagamento status) {
        this.id = id;
        this.valor = valor;
        this.dataCriacao = dataCriacao;
        this.nomePagador = nomePagador;
        this.nomeDestinatario = nomeDestinatario;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
}
