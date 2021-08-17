package br.com.fiap.loja.repository;

import br.com.fiap.loja.models.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
