package br.com.fiap.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.PedidosItens;

public interface PedidosItensRepository extends JpaRepository<PedidosItens, Long> {
}
