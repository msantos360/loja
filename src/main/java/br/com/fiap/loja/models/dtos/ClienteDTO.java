package br.com.fiap.loja.models.dtos;

import br.com.fiap.loja.models.Enderecos;
import br.com.fiap.loja.models.Pedido;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ClienteDTO implements Serializable {

    private Long id;
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private List<Enderecos> enderecos;
    private List<Pedido> pedidos;


    public ClienteDTO(Long id, String cpf, String nome, LocalDate dataNascimento, List<Enderecos> enderecos, List<Pedido> pedidos) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
        this.pedidos = pedidos;
    }

    public ClienteDTO() {

    }

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

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
