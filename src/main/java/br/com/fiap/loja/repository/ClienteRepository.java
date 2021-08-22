package br.com.fiap.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
