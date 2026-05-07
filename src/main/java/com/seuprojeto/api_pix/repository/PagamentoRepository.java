package com.seuprojeto.api_pix.repository;

import com.seuprojeto.api_pix.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
