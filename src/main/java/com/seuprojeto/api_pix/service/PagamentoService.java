package com.seuprojeto.api_pix.service;

import com.seuprojeto.api_pix.domain.Pagamento;
import com.seuprojeto.api_pix.domain.StatusPagamento;
import com.seuprojeto.api_pix.dto.PagamentoRequest;
import com.seuprojeto.api_pix.dto.PagamentoResponse;
import com.seuprojeto.api_pix.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PagamentoService {

    private final PagamentoRepository repository;

    public PagamentoService(PagamentoRepository repository) {
        this.repository = repository;
    }

    public PagamentoResponse criar(PagamentoRequest request){

        Pagamento pagamento = new Pagamento();

        pagamento.setValor(request.getValor());
        pagamento.setNomePagador(request.getNomePagador());
        pagamento.setNomeDestinatario(request.getNomeDestinatario());
        pagamento.setStatus(StatusPagamento.PENDENTE);
        pagamento.setDataCriacao(LocalDateTime.now());

        repository.save(pagamento);
        PagamentoResponse pagamentoResponse = new PagamentoResponse(pagamento.getId(),
                pagamento.getValor(),
                pagamento.getNomePagador(),
                pagamento.getNomeDestinatario(),
                pagamento.getStatus(),
                pagamento.getDataCriacao());
        return pagamentoResponse;
    }
}
