package br.com.fiap.loja.repository;

import br.com.fiap.loja.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
