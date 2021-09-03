package br.com.fiap.loja.models.dtos;

import br.com.fiap.loja.models.Produto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProdutoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    public Long id;
    public String nome;
    private LocalDate dataCriacao;

    public ProdutoDto(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.dataCriacao = produto.getDataCriacao();
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
}
