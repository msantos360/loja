package br.com.fiap.loja.models.dto;

import br.com.fiap.loja.models.Cliente;
import br.com.fiap.loja.models.Enderecos;
import br.com.fiap.loja.models.Pedidos;

import java.time.LocalDate;
import java.util.List;

public class ClienteDTO {

    private Long id;
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private List<Enderecos> enderecos;
    private List<Pedidos> pedidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}
