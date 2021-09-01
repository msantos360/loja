package br.com.fiap.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.PedidoItens;

public interface PedidoItensRepository extends JpaRepository<PedidoItens, Long> {
}
