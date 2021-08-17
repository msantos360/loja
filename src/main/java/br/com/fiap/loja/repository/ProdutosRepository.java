package br.com.fiap.loja.repository;

import br.com.fiap.loja.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
