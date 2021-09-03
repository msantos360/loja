package br.com.fiap.loja.models;

import br.com.fiap.loja.models.dtos.ProdutoAddOuUpdateDTO;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "produto", schema = "loja")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private LocalDate dataCriacao = LocalDate.now();

    public Produto(ProdutoAddOuUpdateDTO produtoAddOuUpdateDTO) {
        this.nome = produtoAddOuUpdateDTO.getNome();
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
    private List<br.com.fiap.loja.models.PedidoItens> PedidoItens;

    public Produto() {
    }
}
