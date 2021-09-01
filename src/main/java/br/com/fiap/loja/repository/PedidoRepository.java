package br.com.fiap.loja.repository;

import br.com.fiap.loja.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
