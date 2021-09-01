package br.com.fiap.loja.models.Dtos;

import br.com.fiap.loja.models.Pedido;
import br.com.fiap.loja.models.Produto;

import java.util.Objects;

public class PedidoItensDTO {

    private String nome;
    private Long quantidade;
    private Double valor;
    private Pedido pedido;
    private Produto produto;

    public PedidoItensDTO(String nome, Long quantidade, Double valor, Pedido pedido, Produto produto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.pedido = pedido;
        this.produto = produto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoItensDTO that = (PedidoItensDTO) o;
        return Objects.equals(nome, that.nome) && Objects.equals(quantidade, that.quantidade) && Objects.equals(valor, that.valor) && Objects.equals(pedido, that.pedido) && Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantidade, valor, pedido, produto);
    }

}
