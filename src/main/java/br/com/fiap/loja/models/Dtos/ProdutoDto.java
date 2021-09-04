package br.com.fiap.loja.models.Dtos;

import br.com.fiap.loja.models.Produto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProdutoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private int quantidade;
    private double valor;
    private LocalDate dataCriacao;

    public ProdutoDto(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.dataCriacao = produto.getDataCriacao();
        this.quantidade = produto.getQuantidade();
        this.valor = produto.getValor();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
