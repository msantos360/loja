package br.com.fiap.loja.repository;

import br.com.fiap.loja.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
