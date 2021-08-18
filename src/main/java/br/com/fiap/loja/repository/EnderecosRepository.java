package br.com.fiap.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.loja.models.Enderecos;

public interface EnderecosRepository extends JpaRepository<Enderecos, Long> {
}
