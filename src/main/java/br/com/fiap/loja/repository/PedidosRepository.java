package br.com.fiap.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
