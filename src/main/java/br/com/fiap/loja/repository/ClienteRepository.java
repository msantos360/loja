package br.com.fiap.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
