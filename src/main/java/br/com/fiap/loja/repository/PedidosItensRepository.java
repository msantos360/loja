package br.com.fiap.loja.repository;

import br.com.fiap.loja.models.PedidosItens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosItensRepository extends JpaRepository<PedidosItens, Long> {
}
