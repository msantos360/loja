package br.com.fiap.loja.models.dtos;

import java.io.Serializable;

public class ProdutoAddOuUpdateDTO  implements Serializable  {
    private static final long serialVersionUID = 1L;

    private String nome;
    private int quantidade;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
