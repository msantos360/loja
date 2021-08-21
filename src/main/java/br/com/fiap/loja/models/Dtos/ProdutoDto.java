package br.com.fiap.loja.models.Dtos;

import br.com.fiap.loja.models.Produto;

import java.time.LocalDate;

public class ProdutoDto {

    public Long id;
    public String nome;
    private LocalDate dataCriacao;

    public ProdutoDto(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.dataCriacao = produto.getDataCriacao();
    }
}
